package com.xuhuawei.okhttp.interceptor;

import com.xuhuawei.okhttp.Request;

public class BaseInterceptor {
    public Request request;

    public BaseInterceptor(Request request) {
        this.request = request;
    }
}
