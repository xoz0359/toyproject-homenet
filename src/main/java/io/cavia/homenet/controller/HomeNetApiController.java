package io.cavia.homenet.controller;
import io.cavia.homenet.repository.OrderRealTimeRepository;
import io.cavia.homenet.repository.StockRealTimeRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cavia/homenet")
public class HomeNetApiController {

    private final OrderRealTimeRepository orderRealTimeRepository;
    private final StockRealTimeRepository stockRealTimeRepository;

    public HomeNetApiController(OrderRealTimeRepository orderRealTimeRepository, StockRealTimeRepository stockRealTimeRepository) {
        this.orderRealTimeRepository = orderRealTimeRepository;
        this.stockRealTimeRepository = stockRealTimeRepository;
    }

    /**
     * Post
     * Get
     *  stock: 종목 별 정적 데이터 반환
     *
     *  stock-realtime: 종목 별 동적 데이터 반환
     *  order-realtime: 종목의 호가창 동적 데이터 반환
     */

    //@GetMapping("/stocks/{id}/quotes")


    //@GetMapping("/stocks/{id}/trades")

}
