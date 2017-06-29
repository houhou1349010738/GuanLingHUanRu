package com.example.retrofitlibrary;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/26 10:20
 * 邮箱：17600157003@163.com
 * 创建一个网络请求的拦截器
 */

/**
 * BaseInterceptor，use set okhttp call header
 * Created by Tamic on 2016-06-30.
 */
    public class BaseInterceptor implements Interceptor {

    private Map<String, String> headers;

    public BaseInterceptor(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * 重写拦截器的方法追加请求头
     * @param chain
     * @return
     * @throws IOException
     */
        @Override
        public Response intercept(Chain chain) throws IOException {

        Request.Builder builder = chain.request()
                .newBuilder();
        if (headers != null && headers.size() > 0) {
            Set<String> keys = headers.keySet();
            for (String headerKey : keys) {
                builder.addHeader(headerKey,   headers.get(headerKey)).build();
            }
        }
        return chain.proceed(builder.build());

    }
}