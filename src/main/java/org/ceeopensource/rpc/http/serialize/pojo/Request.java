package org.ceeopensource.rpc.http.serialize.pojo;

/**
 * 请求参数POJO
 * <pre>
 *     author      XueQi
 *     date        16/1/26
 *     email       xueqi1992@vip.qq.com
 * </pre>
 */
public class Request {

    /**
     * 执行目标接口类
     */
    private Class clazz;
    /**
     * 目标接口类的方法
     */
    private String method;
    /**
     * 请求参数
     */
    private Object param;

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }
}
