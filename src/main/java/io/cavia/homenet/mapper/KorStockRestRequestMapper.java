package io.cavia.homenet.mapper;

import io.cavia.homenet.domain.Stock;
import io.cavia.homenet.dto.response.*;
import io.cavia.homenet.repository.StockDefaltRepository;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface KorStockRestRequestMapper {
    /**
     * 스프링이 구현체를 자동생성해서 주입해줍니다
     * @param output
     * @return
     */

    Stock toStock(KorStock046Output output);
    Stock toStock(KorStock046Output output, @MappingTarget Stock stock);

    Stock toStock(KorStock067Output output);
    Stock toStock(KorStock067Output output, @MappingTarget Stock stock);

    Stock toStock(KorStock145Output output);
    Stock toStock(KorStock145Output output, @MappingTarget Stock stock);

    Stock toStock(KorStock150Output output);
    Stock toStock(KorStock150Output output, @MappingTarget Stock stock);

    Stock toStock(KorStock213Output1 output);
    Stock toStock(KorStock213Output1 output, @MappingTarget Stock stock);
}
