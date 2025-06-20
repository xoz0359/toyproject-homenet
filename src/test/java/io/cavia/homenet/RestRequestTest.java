package io.cavia.homenet;

import io.cavia.homenet.client.RestWebClient;
import io.cavia.homenet.mapper.KorStockRestRequestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestRequestTest {

    @Autowired
    private RestWebClient restWebClient;
    @Autowired
    private KorStockRestRequestMapper korStockRestRequestMapper;

    private String code = "005930";

    @Test
    public void RequestAndParsingTest() {
       System.out.println(restWebClient.searchMarketIsOpen040());
    }


    /*public Stock stockInfosetter(Stock stock, String code) {
        List<KorStock046Output> list046 = restWebClient.searchStockInfo046(code).getOutput();
        for (KorStock046Output output : list046) {
            korStockRestRequestMapper.toStock(output, stock);
        }
        korStockRestRequestMapper.toStock(restWebClient.searchStockInfo067(code).getOutput(), stock);
        korStockRestRequestMapper.toStock(restWebClient.searchStockInfo145(code, "20100101", "20250527").getOutput().get(0), stock);
        korStockRestRequestMapper.toStock(restWebClient.searchStockInfo150(code, "20100101", "20250527").getOutput().get(0), stock);
        return stock;
    }*/

    @Test
    public void saveAllTest1(){
        System.out.println(restWebClient.searchStockInfo047("1001", "3"));

    }
}
