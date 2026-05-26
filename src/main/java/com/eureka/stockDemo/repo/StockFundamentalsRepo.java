package com.eureka.stockDemo.repo;

import com.eureka.stockDemo.entity.StockFundamentalsEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockFundamentalsRepo extends JpaRepository<StockFundamentalsEnt,Integer> {
    Optional<StockFundamentalsEnt>  findByTickerSymbol(String tickerSymbol);
}
