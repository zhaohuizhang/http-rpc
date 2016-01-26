package org.ceeopensource.rpc.http.container;

/**
 * 服务方容器
 * <pre>
 *     author      XueQi
 *     date        16/1/26
 *     email       qi01.xue@vipshop.com
 * </pre>
 */
public abstract class Container {
    public static volatile boolean isStart      = false;
    public static volatile Container container  = null;

    /**
     * 容器开始方法
     */
    public abstract void start();
}
