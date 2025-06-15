package io.cavia.homenet.mapper;

import io.cavia.homenet.domain.StockRealTime;
import org.hibernate.grammars.hql.HqlParser;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class KorStockRealTimeMapper {
    /**
     * 국내주식 실시간체결가 요청으로 발생하는 dvs를 Entity로 변환하는 메서드 입니다
     * dvs는 '^'를 구분자로 가지고 45개의 데이터가 매핑되어 있습니다
     * 확인 결과 null로 전달 되는 값과 각각 다른 타입으로 파싱해야 하는 데이터가 있어서
     * 추후 보수를 고려하여 가장 원시적인 형태로 메서드를 작성하였습니다
     * '^'는 정규식에서 라인 시작을 의미하기 때문에 구분자로 사용하려면 이스케이프 해주어야 합니다
     * @return
     */
    public StockRealTime toEntity(String[] datas, Long stockId) {
        if(datas == null) {
            throw new RuntimeException("매핑 중 오류 발생: Null이 입력되었습니다.");
        }
        return new StockRealTime(
                stockId,
                Integer.parseInt(datas[2]),  // stckPrpr
                Long.parseLong(datas[12]), // cntgVol
                Integer.parseInt(datas[45]),  // viStndPrc
                LocalDateTime.now()
        );
    }
}
