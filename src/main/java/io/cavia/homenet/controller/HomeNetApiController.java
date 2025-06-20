package io.cavia.homenet.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cavia.homenet.domain.Quotes;
import io.cavia.homenet.domain.Stocks;
import io.cavia.homenet.domain.Trades;
import io.cavia.homenet.repository.QotesDefaltRepository;
import io.cavia.homenet.repository.TradesDefaltRepository;
import io.cavia.homenet.service.SummaryStocksDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cavia/homenet")
public class HomeNetApiController {


    private final SummaryStocksDataService summaryStocksDataService;
    private final ObjectMapper objectMapper;

    public HomeNetApiController(SummaryStocksDataService summaryStocksDataService, ObjectMapper objectMapper) {
        this.summaryStocksDataService = summaryStocksDataService;
        this.objectMapper = objectMapper;
    }




    /**
     * Post
     * Get
     *  stock: 종목 별 정적 데이터 반환
     *
     *  getStocks: 저장된 모든 종목 row의 List 반환
     *  getStockTrades(int id): 해당 stockId를 가지고 있는 실시간 체결 집계 데이터의 List 반환
     *  getStockQuotes(int id): 해당 stockId를 가지고 있는 실시간 호가 집계 데이터의 List 반환
     */

    @GetMapping("/stocks")
    public ResponseEntity<String> getStocks() {
        try {
            List<Stocks> stocks = summaryStocksDataService.getStocksAll();
            String stocksJson = objectMapper.writeValueAsString(stocks);
            return ResponseEntity
                    .status(200)
                    .body(stocksJson);
        }catch (Exception e) {
            return ResponseEntity
                    .status(500)
                    .body("현재 저장되어 있는 종목이 존재하지 않습니다.");
        }
    }

    @GetMapping("/stock/{id}/trades")
    public ResponseEntity<List<Trades>> getStockTrades(@PathVariable int id) {
        return summaryStocksDataService.getTradesByStockId(id);
    }

    @GetMapping("/stock/{id}/quotes")
    public ResponseEntity<List<Quotes>> getStockQuotes(@PathVariable int id) {
        return summaryStocksDataService.getQuotesByStockId(id);
    }

    @GetMapping("/stocks/delete/{id}")
    public ResponseEntity<String> deleteStocks(@PathVariable int id) {
        summaryStocksDataService.deleteStocks(id);
        summaryStocksDataService.deleteTrades(id);
        summaryStocksDataService.deleteQuotes(id);
    }

}
