package io.cavia.homenet.controller;
import io.cavia.homenet.repository.TradesDefaltRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cavia/homenet")
public class HomeNetApiController {

    private TradesDefaltRepository tradesDefaltRepository;



    /**
     * Post
     * Get
     *  stock: 종목 별 정적 데이터 반환
     *
     *  stock-realtime: 종목 별 동적 데이터 반환
     *  order-realtime: 종목의 호가창 동적 데이터 반환
     */

    @GetMapping("/stocks/{id}/quotes")
    public String getStockQuotes(@PathVariable Long id) {
        return "getStockQuotes";
    }


    @GetMapping("/stocks/{id}/trades")
    public String getStockTrades() {
        return "getStockTrades";
    }

}
