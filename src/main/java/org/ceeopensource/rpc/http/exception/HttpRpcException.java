package org.ceeopensource.rpc.http.exception;

import org.ceeopensource.rpc.exception.RpcException;

/**
 * HttpRpc异常类
 * <pre>
 *     author      XueQi
 *     date        16/1/26
 *     email       xueqi1992@vip.qq.com
 * </pre>
 */
public class HttpRpcException extends RpcException {

    public HttpRpcException(String message, Throwable cause, String code, Object data) {
        super(message, cause, code, data);
    }

}
