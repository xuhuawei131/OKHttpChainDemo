package com.xuhuawei.okhttp.interceptor;

import com.xuhuawei.okhttp.Interceptor;
import com.xuhuawei.okhttp.Request;
import com.xuhuawei.okhttp.Response;

import java.io.IOException;

public class FourInterceptor extends BaseInterceptor implements Interceptor {
    public FourInterceptor(Request request) {
        super(request);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        System.out.println("FourInterceptor intercept");
        Response response=new Response();
        response.response="ok";
        return response;
    }
}
