package com.eureka.stockDemo.service;

import com.eureka.stockDemo.dto.StockFundamentalResponseDto;
import com.eureka.stockDemo.dto.SubsectorResponseDto;

import java.time.LocalDate;
import java.util.List;

public interface StockService {
    List<SubsectorResponseDto> getTop5Stocks();


    StockFundamentalResponseDto
    getStockFundamentals(

            String tickerSymbol,

            LocalDate fromDate,

            LocalDate toDate
    );
}
