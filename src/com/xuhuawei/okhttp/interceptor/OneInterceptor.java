package com.xuhuawei.okhttp.interceptor;

import com.xuhuawei.okhttp.Interceptor;
import com.xuhuawei.okhttp.Request;
import com.xuhuawei.okhttp.Response;

import java.io.IOException;

public class OneInterceptor extends BaseInterceptor implements Interceptor {
    public OneInterceptor(Request request) {
        super(request);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        System.out.println("OneInterceptor intercept");
        return chain.proceed(request);
    }
}
