package com.eureka.stockDemo.service;

import com.eureka.stockDemo.dto.StockDto;
import com.eureka.stockDemo.dto.SubsectorResponseDto;
import com.eureka.stockDemo.entity.StockFundamentalsEnt;
import com.eureka.stockDemo.entity.StockPriceHistoryEntity;
import com.eureka.stockDemo.repo.StockFundamentalsRepo;
import com.eureka.stockDemo.repo.StocksPriceHistoryRepo;
import org.springframework.stereotype.Service;
import com.eureka.stockDemo.dto.TradingHistoryDto;

import com.eureka.stockDemo.dto.StockFundamentalResponseDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StockServiceImp implements StockService {

    private final StockFundamentalsRepo repository,stockRepo;
    private final StocksPriceHistoryRepo historyRepo;

    public StockServiceImp(StockFundamentalsRepo repository,StockFundamentalsRepo stockRepo,StocksPriceHistoryRepo historyRepo) {
        this.repository = repository;
        this.stockRepo=stockRepo;
        this.historyRepo=historyRepo;
    }


    @Override
    public List<SubsectorResponseDto> getTop5Stocks() {

        List<StockFundamentalsEnt> allStocks =
                repository.findAll();

        Map<String, List<StockFundamentalsEnt>> groupedStocks =
                allStocks.stream()
                        .collect(Collectors.groupingBy(
                                x -> x.getSubsector()
                                        .getSubsectorName()
                        ));

        List<SubsectorResponseDto> response =
                new ArrayList<>();

        groupedStocks.forEach((subsectorName, stocks) -> {

            List<StockDto> topStocks =
                    stocks.stream()
                            .sorted((a, b) ->
                                    Long.compare(
                                            b.getMarketCap(),
                                            a.getMarketCap()
                                    ))
                            .limit(5)
                            .map(x -> {

                                StockDto dto =
                                        new StockDto();

                                dto.setStockName(
                                        x.getStock()
                                                .getTickerName()
                                );

                                dto.setMarketCap(
                                        x.getMarketCap()
                                );

                                return dto;
                            })
                            .toList();

            SubsectorResponseDto dto =
                    new SubsectorResponseDto();

            dto.setSubsectorName(subsectorName);

            dto.setSectorName(
                    stocks.get(0)
                            .getSubsector()
                            .getSector()
                            .getSectorName()
            );

            dto.setTopStocks(topStocks);

            response.add(dto);
        });

        return response;
    }

//    ====

    @Override
    public StockFundamentalResponseDto
    getStockFundamentals(

            String tickerSymbol,

            LocalDate fromDate,

            LocalDate toDate
    ) {

        StockFundamentalsEnt stock =
                stockRepo
                        .findByTickerSymbol(
                                tickerSymbol
                        )
                        .orElseThrow();

        List<StockPriceHistoryEntity> history =

                historyRepo
                        .findByTickerSymbolAndTradingDateBetween(

                                tickerSymbol,

                                fromDate,

                                toDate
                        );

        List<TradingHistoryDto> historyDtos =

                history.stream()
                        .map(x -> {

                            TradingHistoryDto dto =
                                    new TradingHistoryDto();

                            dto.setTickerSymbol(
                                    x.getTickerSymbol()
                            );

                            dto.setTradingDate(
                                    x.getTradingDate()
                            );

                            dto.setClosePrice(
                                    x.getClosePrice()
                            );

                            dto.setVolume(
                                    x.getVolume()
                            );

                            return dto;
                        })
                        .toList();

        StockFundamentalResponseDto dto =
                new StockFundamentalResponseDto();

        dto.setMarketCap(
                stock.getMarketCap()
        );

        dto.setCurrentRatio(
                stock.getCurrentRatio()
        );

        dto.setTradingHistory(historyDtos);

        return dto;
    }
}

