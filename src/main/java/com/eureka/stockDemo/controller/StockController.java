package com.eureka.stockDemo.controller;

import com.eureka.stockDemo.dto.StockFundamentalResponseDto;
import com.eureka.stockDemo.dto.SubsectorResponseDto;
import com.eureka.stockDemo.service.StockService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("/stocks")
@CrossOrigin(origins = "*")
public class StockController {
    private final StockService stockService;

    public StockController(
            StockService stockService
    ) {
        this.stockService = stockService;
    }

    @GetMapping("/top5")
    public List<SubsectorResponseDto> getTopStocks() {

        return stockService.getTop5Stocks();
    }

    @GetMapping(
            "/{tickerSymbol}/{fromDate}/{toDate}")
    public StockFundamentalResponseDto
    getStockFundamentals(
            @PathVariable String tickerSymbol,
             @PathVariable LocalDate fromDate,
     @PathVariable LocalDate toDate)
    {
        return stockService
                .getStockFundamentals(
                        tickerSymbol,
                        fromDate,
                        toDate
                );
    }
}
