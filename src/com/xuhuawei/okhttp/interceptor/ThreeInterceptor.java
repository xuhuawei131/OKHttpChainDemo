package com.xuhuawei.okhttp.interceptor;

import com.xuhuawei.okhttp.Interceptor;
import com.xuhuawei.okhttp.Request;
import com.xuhuawei.okhttp.Response;

import java.io.IOException;

public class ThreeInterceptor extends BaseInterceptor implements Interceptor {
    public ThreeInterceptor(Request request) {
        super(request);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        System.out.println("ThreeInterceptor intercept");
        return chain.proceed(request);
    }
}
