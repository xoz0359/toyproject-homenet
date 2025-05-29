package io.cavia.homenet;

import io.cavia.homenet.client.RestWebClient;
import io.cavia.homenet.domain.Stock;
import io.cavia.homenet.dto.response.KorStock046Dto;
import io.cavia.homenet.dto.response.KorStock046Output;
import io.cavia.homenet.mapper.KorStockRestRequestMapper;
import io.cavia.homenet.repository.StockDefaltRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class RestRequestTest {

    @Autowired
    private RestWebClient restWebClient;
    @Autowired
    private StockDefaltRepository stockDefaltRepository;
    @Autowired
    private KorStockRestRequestMapper korStockRestRequestMapper;

    private String code = "005930";

    @Test
    public void RequestAndParsingTest() {
        System.out.println(restWebClient.searchStockInfo067(code));
        System.out.println(restWebClient.searchStockInfo046(code));
        System.out.println(restWebClient.searchStockInfo145(code, "20100101", "20250527"));
        System.out.println(restWebClient.searchStockInfo150(code, "20100101", "20250527"));
        System.out.println(restWebClient.searchStockInfo213(code, "20250527", "100000"));
        System.out.println(restWebClient.searchIndustryInfo063("U", "1001"));
        System.out.println(restWebClient.searchIndustryInfo065("D", "U", "1001", "20250527"));

    }

    @Test
    public void saveTest(){
        Stock stock = new Stock();
        stockDefaltRepository.save(stockInfosetter(stock, code));
    }

    public Stock stockInfosetter(Stock stock, String code) {
        List<KorStock046Output> list046 = restWebClient.searchStockInfo046(code).getOutput();
        for (KorStock046Output output : list046) {
            korStockRestRequestMapper.toStock(output, stock);
        }
        korStockRestRequestMapper.toStock(restWebClient.searchStockInfo067(code).getOutput(), stock);
        korStockRestRequestMapper.toStock(restWebClient.searchStockInfo145(code, "20100101", "20250527").getOutput().get(0), stock);
        korStockRestRequestMapper.toStock(restWebClient.searchStockInfo150(code, "20100101", "20250527").getOutput().get(0), stock);
        return stock;
    }
}
