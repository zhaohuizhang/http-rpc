package org.ceeopensource.rpc.http.serialize;

/**
 * 报文消息格式化接口
 * <pre>
 *     author      XueQi
 *     date        16/1/26
 *     email       xueqi1992@vip.qq.com
 * </pre>
 */
public interface Formater {

    /**
     * 请求报文格式化
     *
     * @param clazz  调用目标类
     * @param method 目标类方法
     * @param param  参数
     * @return
     */
    String requestFormat(Class clazz, String method, Object param);

    /**
     * 响应报文格式化
     *
     * @param param 响应参数
     * @return
     */
    String responseFormat(Object param);

}
