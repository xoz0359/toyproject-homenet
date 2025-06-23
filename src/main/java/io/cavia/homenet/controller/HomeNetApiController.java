package io.cavia.homenet.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cavia.homenet.domain.Quotes;
import io.cavia.homenet.domain.Stocks;
import io.cavia.homenet.domain.Trades;
import io.cavia.homenet.dto.error.HomenetApiErrorResponse;
import io.cavia.homenet.service.SummaryStocksDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homenet")
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
    public ResponseEntity<?> getStocks() {
            List<Stocks> stocks = summaryStocksDataService.getStocksAll();

            if(stocks == null || stocks.isEmpty()) {
                return ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body(new HomenetApiErrorResponse(HttpStatus.NOT_FOUND.value(),
                                "Error: 현재 DB에 저장된 종목 데이터가 없습니다."));
            }else{
                    return ResponseEntity
                            .status(HttpStatus.OK)
                            .body(stocks);
            }
    }

    @GetMapping("/stock/{id}/trades")
    public ResponseEntity<?> getStockTrades(@PathVariable int id) {
        List<Trades> trades = summaryStocksDataService.getTradesByStockId(id);

        if(trades == null || trades.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(new HomenetApiErrorResponse(HttpStatus.NOT_FOUND.value(),
                            "Error: 유효하지 않은 ID 값입니다."));
        }else{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(trades);
        }
    }

    @GetMapping("/stock/{id}/quotes")
    public ResponseEntity<?> getStockQuotes(@PathVariable int id) {
        List<Quotes> quotes = summaryStocksDataService.getQuotesByStockId(id);

        if(quotes == null || quotes.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(new HomenetApiErrorResponse(HttpStatus.NOT_FOUND.value(),
                            "Error: 유효하지 않은 ID 값입니다."));
        }else{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(quotes);
        }
    }

    @DeleteMapping("/stocks/delete/{id}")
    public ResponseEntity<?> deleteStocks(@PathVariable int id) {
        try {
            summaryStocksDataService.deleteStocks(id);
            summaryStocksDataService.deleteTrades(id);
            summaryStocksDataService.deleteQuotes(id);
        }catch(Exception e){
              return ResponseEntity
                      .status(HttpStatus.INTERNAL_SERVER_ERROR)
                      .body(new HomenetApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                      "Error: DB에서 삭제 중 오류가 발생했습니다."));
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Success: DB에서 종목 데이터 삭제 완료");
    }

}
