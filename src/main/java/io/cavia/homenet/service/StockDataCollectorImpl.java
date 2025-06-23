package io.cavia.homenet.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class StockDataCollectorImpl implements StockDataCollector {

    private final SummaryStocksDataService summaryStocksDataService;

    public StockDataCollectorImpl(SummaryStocksDataService summaryStocksDataService) {
    this.summaryStocksDataService = summaryStocksDataService;
    }

    @Override
    @Scheduled(cron = "0 41 11 * * ?")
    public void collect() {
        summaryStocksDataService.collectStockDatas();
    }

}
