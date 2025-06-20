package io.cavia.homenet.service;

import io.cavia.homenet.domain.Quotes;
import io.cavia.homenet.domain.Stocks;
import io.cavia.homenet.domain.Trades;

import java.util.List;

public interface SummaryStocksDataService {

    List<Stocks> getStocksAll();
    List<Quotes> getQuotesByStockId(int id);
    List<Trades> getTradesByStockId(int id);
    void deleteStocks(int id);
    void deleteTrades(int id);
    void deleteQuotes(int id);
}
