package com.wuhao.configuration;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

@Slf4j
public class OrderTablesPreciseShardingConfig implements PreciseShardingAlgorithm<Long> {


    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        Long value = preciseShardingValue.getValue();
        if(null == value){
            throw new UnsupportedOperationException("prec is null");
        }
        String valueStr = value.toString();
        int tableIndex = Integer.parseInt(valueStr.substring(valueStr.length() - 1, valueStr.length()));
        String tableName = "t_user_"+tableIndex;
        for (String collectionDbName : collection) {//循环表名已确定使用哪张表
            if (collectionDbName.equals(tableName)){  //表示相等就返回
                log.info("库名为 | {}",collectionDbName);
                return collectionDbName;
            }
        }
        return null;
    }
}
