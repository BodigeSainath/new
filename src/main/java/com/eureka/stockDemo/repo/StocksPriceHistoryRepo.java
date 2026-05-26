package com.eureka.stockDemo.repo;
import com.eureka.stockDemo.entity.StockPriceHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface StocksPriceHistoryRepo extends JpaRepository<StockPriceHistoryEntity, Integer>  {
    List<StockPriceHistoryEntity>
    findByTickerSymbolAndTradingDateBetween(

            String tickerSymbol,

            LocalDate fromDate,

            LocalDate toDate);
}
