package org.ceeopensource.rpc.http.serialize;

import org.ceeopensource.rpc.exception.RpcException;
import org.ceeopensource.rpc.http.serialize.pojo.Request;

/**
 * 报文解析处理
 * <pre>
 *     author      XueQi
 *     date        16/1/26
 *     email       xueqi1992@vip.qq.com
 * </pre>
 */
public interface Parser {

    /**
     * 解析请求报文
     *
     * @param param 请求报文
     * @return
     * @throws RpcException
     */
    Request requestParse(String param) throws RpcException;

    /**
     * 响应报文解析
     *
     * @param result
     * @param <T>
     * @return
     */
    <T> T responseParse(String result);
}
