package io.cavia.homenet.service;

import io.cavia.homenet.domain.Quotes;
import io.cavia.homenet.domain.Stocks;
import io.cavia.homenet.domain.Trades;

import java.util.List;

public interface SummaryStocksDataService {

    void collectStockDatas();
    void deleteApiToken();
    List<Stocks> getStocksAll();
    List<Trades> getTradesByStockId(int stockId);
    List<Quotes> getQuotesByStockId(int stockId);
    void deleteStocks(int stockId);
    void synchronizedIdWithRowCount();
}
