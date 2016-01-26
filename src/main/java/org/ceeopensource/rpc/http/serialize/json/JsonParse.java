package org.ceeopensource.rpc.http.serialize.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.ceeopensource.rpc.exception.RpcException;
import org.ceeopensource.rpc.http.exception.HttpRpcException;
import org.ceeopensource.rpc.http.exception.HttpRpcExceptionCodeEnum;
import org.ceeopensource.rpc.http.serialize.Parser;
import org.ceeopensource.rpc.http.serialize.pojo.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 *     author      XueQi
 *     date        16/1/26
 *     email       xueqi1992@vip.qq.com
 * </pre>
 */
public class JsonParse implements Parser {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonParse.class);

    private JsonParse() {
    }

    /**
     * 属于懒汉式单例,
     * 因为Java机制规定，内部类SingletonHolder只有在getInstance()方法第一次调用的时候才会被加载(实现了lazy),
     * 而且其加载过程是线程安全的。内部类加载的时候实例化一次instance
     */
    private static class SingletonHolder {
        private static final JsonParse INSTANCE = new JsonParse();
    }

    public static JsonParse getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public Request requestParse(String param) throws RpcException {
        try {
            LOGGER.debug("parse request Param: [{}]", param);
            return JSONObject.parseObject(param, Request.class);
        } catch (Exception e) {
            LOGGER.error("parse request error, Param:[{}]", param, e);

            HttpRpcExceptionCodeEnum errorCodeEnum = HttpRpcExceptionCodeEnum.DATA_PARSER_ERROR;
            throw new HttpRpcException(errorCodeEnum.getMsg(), e, errorCodeEnum.getCode(), param);
        }
    }

    @Override
    public <T> T responseParse(String result) throws RpcException {
        try {
            LOGGER.debug("parse response Param: [{}]", result);
            return (T) JSON.parse(result);
        } catch (Exception e) {
            LOGGER.debug("parse response error, Param: [{}]", result, e);

            HttpRpcExceptionCodeEnum errorCodeEnum = HttpRpcExceptionCodeEnum.DATA_PARSER_ERROR;
            throw new HttpRpcException(errorCodeEnum.getMsg(), e, errorCodeEnum.getCode(), result);
        }
    }
}
