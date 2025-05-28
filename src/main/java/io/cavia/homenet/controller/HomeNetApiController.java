package io.cavia.homenet.controller;
import io.cavia.homenet.domain.OrderRealTime;
import io.cavia.homenet.domain.Stock;
import io.cavia.homenet.domain.StockRealTime;
import io.cavia.homenet.mapper.KorStockRestRequestMapper;
import io.cavia.homenet.repository.OrderRealTimeRepository;
import io.cavia.homenet.repository.StockDefaltRepository;
import io.cavia.homenet.repository.StockRealTimeRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cavia/homenet")
public class HomeNetApiController {

    private final StockDefaltRepository stockDefaltRepository;
    private final OrderRealTimeRepository orderRealTimeRepository;
    private final StockRealTimeRepository stockRealTimeRepository;

    public HomeNetApiController(StockDefaltRepository stockDefaltRepository, OrderRealTimeRepository orderRealTimeRepository, StockRealTimeRepository stockRealTimeRepository){
        this.stockDefaltRepository = stockDefaltRepository;
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

    @GetMapping("/stock")
    public List<Stock> getStock(@RequestParam(value = "pdno", required = false) String code) {
        if( code == null || code.isEmpty()){
            return stockDefaltRepository.findAll();
        }
      return stockDefaltRepository.findByPdno(code);
    }

    @GetMapping("/order-realtime")
    public List<OrderRealTime> getOrderRealTime(@Param("pdno") String code) {
        if( code == null || code.isEmpty()){
            return orderRealTimeRepository.findAll();
         }
        return orderRealTimeRepository.findByMkscShrnIscd(code);
    }

    @GetMapping("/stock-realtime")
    public List<StockRealTime> getStockRealTime(@Param("pdno") String code) {
        if( code == null || code.isEmpty()){
            return stockRealTimeRepository.findAll();
        }
        return stockRealTimeRepository.findByMkscShrnIscd(code);
    }
}
