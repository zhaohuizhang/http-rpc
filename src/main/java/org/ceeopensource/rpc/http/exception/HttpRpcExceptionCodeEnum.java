package org.ceeopensource.rpc.http.exception;

/**
 * Http Rpc Exception 枚举类
 * <pre>
 *     author      XueQi
 *     date        16/1/26
 *     email       xueqi1992@vip.qq.com
 * </pre>
 */
public enum HttpRpcExceptionCodeEnum {

    DATA_PARSER_ERROR("DATA_PARSER_ERROR", "数据转换异常"),
    NO_BEAN_FOUND("NO_BEAN_FOUND", "没有找到bean对象"),
    INVOKE_REQUEST_ERROR("INVOKE_REQUEST_ERROR", "HTTP RPC请求异常"),;

    private String code;
    private String msg;

    HttpRpcExceptionCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
