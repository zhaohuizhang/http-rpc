package org.ceeopensource.rpc.http.serialize.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.ceeopensource.rpc.http.serialize.Formater;
import org.ceeopensource.rpc.http.serialize.pojo.Request;

/**
 * <pre>
 *     author      XueQi
 *     date        16/1/26
 *     email       xueqi1992@vip.qq.com
 * </pre>
 */
public class JsonFormat implements Formater {
    @Override
    public String requestFormat(Class clazz, String method, Object[] param) {
        Request request = new Request();
        request.setClazz(clazz);
        request.setMethod(method);
        request.setParam(param);

        return JSON.toJSONString(request, SerializerFeature.WriteClassName);
    }

    @Override
    public String responseFormat(Object param) {
        return JSON.toJSONString(param, SerializerFeature.WriteClassName);
    }
}
