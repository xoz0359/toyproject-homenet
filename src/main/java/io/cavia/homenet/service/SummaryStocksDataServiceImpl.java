package io.cavia.homenet.service;

import io.cavia.homenet.domain.Quotes;
import io.cavia.homenet.domain.Stocks;
import io.cavia.homenet.domain.Trades;
import io.cavia.homenet.repository.QotesDefaltRepository;
import io.cavia.homenet.repository.StocksDefaltRepository;
import io.cavia.homenet.repository.TradesDefaltRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryStocksDataServiceImpl implements SummaryStocksDataService {

    private final StocksDefaltRepository stockDefaltRepository;
    private final TradesDefaltRepository tradesDefaltRepository;
    private final QotesDefaltRepository qotesDefaltRepository;


    public SummaryStocksDataServiceImpl(StocksDefaltRepository stocksDefaltRepository, TradesDefaltRepository tradesDefaltRepository, QotesDefaltRepository qotesDefaltRepository) {
        this.stockDefaltRepository = stocksDefaltRepository;
        this.tradesDefaltRepository = tradesDefaltRepository;
        this.qotesDefaltRepository = qotesDefaltRepository;
    }

    @Override
    public List<Stocks> getStocksAll() {
        return stockDefaltRepository.findAllByOrderByIdAsc();
    }

    @Override
    public List<Quotes> getQuotesByStockId(int id) {
        return qotesDefaltRepository.findAllByStockIdOrderByIdAsc(id);
    }

    @Override
    public List<Trades> getTradesByStockId(int id) {
        return tradesDefaltRepository.findAllByStockIdOrderByIdAsc(id);
    }

    @Override
    public void deleteStocks(int id) {
        stockDefaltRepository.deleteById(id);
    }

    @Override
    public void deleteTrades(int id) {
        tradesDefaltRepository.deleteAllByStockId(id);
    }

    @Override
    public void deleteQuotes(int id) {
        qotesDefaltRepository.deleteAllByStockId(id);
    }


}
