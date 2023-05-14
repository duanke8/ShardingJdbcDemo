package com.dk.shardingjdbcdemo.config;

// import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
// import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
//
// import java.util.Collection;
// import java.util.Date;

// public class OrderShardingAlgorithmConfig implements PreciseShardingAlgorithm<Date> {

    /**
     * 精确分片算法
     *
     * @param availableTargetNames 所有配置的库列表
     * @param shardingValue        分片值，也就是save_time_com的值
     * @return 所匹配库的结果
     */
    // @Override
    // public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Date> shardingValue) {
    //     //对于库的分片collection存放的是所有的库的列表，目前只有ds0
    //     //配置的分片的sharding-column对应的值
    //     Date date = shardingValue.getValue();
    //     int month = date.getMonth() + 1;
    //     int year = date.getYear() + 1900;
    //     if (month < 10) {
    //         //按月路由
    //         return shardingValue.getLogicTableName() + "_" + year + "0" + month;
    //     }
    //     //按月路由
    //     return shardingValue.getLogicTableName() + "_" + year + month;
    //
    // }
// }