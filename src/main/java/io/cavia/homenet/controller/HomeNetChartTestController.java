package io.cavia.homenet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeNetChartTestController {

    @GetMapping("주가차트테스트")
    public String priceChartTest() {
        return "priceChartTest";
    }

    @GetMapping("거래량차트테스트")
    public String tradeVolumeChartTest() {
        return "tradeVolumeChartTest";
    }

    @GetMapping("호가창테스트")
    public String orderBookTest() {
        return "orderBookTest";
    }

}
