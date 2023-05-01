package com.itxiaodongbei.mydbrouter;

/**
 * @Author: cxc
 * @CreateTime: 2023-04-21  21:59
 * @Description: 数据库路由配置信息i
 * @Version: 1.0
 */
public class DBRouterConfig {
    private int dbCount; // 分库数
    private int tbCount; // 分表数

    public DBRouterConfig() {
    }

    public DBRouterConfig(int dbCount, int tbCount) {
        this.dbCount = dbCount;
        this.tbCount = tbCount;
    }

    public int getDbCount() {
        return dbCount;
    }

    public void setDbCount(int dbCount) {
        this.dbCount = dbCount;
    }

    public int getTbCount() {
        return tbCount;
    }

    public void setTbCount(int tbCount) {
        this.tbCount = tbCount;
    }
}
