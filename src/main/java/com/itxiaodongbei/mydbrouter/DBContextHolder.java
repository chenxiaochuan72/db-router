package com.itxiaodongbei.mydbrouter;

/**
 * @Author: cxc
 * @CreateTime: 2023-04-21  21:38
 * @Description: 用于本地线程设置路由结果
 * @Version: 1.0
 */
public class DBContextHolder {
    // 分库结果
    private static final ThreadLocal<String> dbKey = new ThreadLocal<String>();
    // 分表结果
    private static final ThreadLocal<String> tbKey = new ThreadLocal<String>();

    public static void setDBKey(String dbKeyIdx) {
        dbKey.set(dbKeyIdx);
    }

    public static String getDBKey() {
        return dbKey.get();
    }

    public static void setTBKey(String tbKeyIdx) {
        tbKey.set(tbKeyIdx);
    }

    public static String getTBKey() {
        return tbKey.get();
    }

    public static void clearDBKey() {
        dbKey.remove();
    }

    public static void clearTBKey() {
        tbKey.remove();
    }
}
