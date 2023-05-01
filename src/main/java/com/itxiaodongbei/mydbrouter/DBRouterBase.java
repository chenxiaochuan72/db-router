package com.itxiaodongbei.mydbrouter;

/**
 * @Author: cxc
 * @CreateTime: 2023-04-21  22:46
 * @Description: TODO
 * @Version: 1.0
 */
public class DBRouterBase {
    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }
}
