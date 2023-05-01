package com.itxiaodongbei.mydbrouter.dynamic;

import com.itxiaodongbei.mydbrouter.DBContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author: cxc
 * @CreateTime: 2023-04-21  21:46
 * @Description: 动态数据源类
 * @Version: 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return "db"+ DBContextHolder.getDBKey();
    }
}
