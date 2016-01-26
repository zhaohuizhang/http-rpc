package org.ceeopensource.rpc.http.serialize;

import org.ceeopensource.rpc.exception.RpcException;

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
    Object requestParse(String param) throws RpcException;

    /**
     * 响应报文解析
     *
     * @param result
     * @param <T>
     * @return
     * @throws RpcException
     */
    <T> T responseParse(String result) throws RpcException;
}
