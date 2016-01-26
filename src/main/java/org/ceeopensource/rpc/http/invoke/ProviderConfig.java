package org.ceeopensource.rpc.http.invoke;

/**
 * 服务方配置类
 * <pre>
 *     author      XueQi
 *     date        16/1/26
 *     email       xueqi1992@vip.qq.com
 * </pre>
 */
public class ProviderConfig {

    private String target;
    /**
     * 端口
     */
    private Integer port;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
