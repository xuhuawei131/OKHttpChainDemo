package com.xuhuawei.okhttp;

import com.xuhuawei.okhttp.interceptor.FourInterceptor;
import com.xuhuawei.okhttp.interceptor.OneInterceptor;
import com.xuhuawei.okhttp.interceptor.ThreeInterceptor;
import com.xuhuawei.okhttp.interceptor.TwoInterceptor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Request request=new Request();
        List<Interceptor> arrayList=new ArrayList<>();
        arrayList.add(new OneInterceptor(request));
        arrayList.add(new TwoInterceptor(request));
        arrayList.add(new ThreeInterceptor(request));
        arrayList.add(new FourInterceptor(request));
        RealInterceptorChain chain=new RealInterceptorChain(arrayList,0,request);
        try {
          Response response= chain.proceed(request);
            System.out.println("response ="+response.response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
