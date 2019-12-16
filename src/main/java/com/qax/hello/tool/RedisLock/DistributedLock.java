package com.qax.hello.tool.RedisLock;//package com.qianxin.demo.tool.RedisLock;

public interface DistributedLock {

    /**
     * 获取锁
     * @return 锁标识
     */
    String acquire();

    /**
     * 释放锁
     * @param indentifier
     * @return
     */
    boolean release(String indentifier);
}
