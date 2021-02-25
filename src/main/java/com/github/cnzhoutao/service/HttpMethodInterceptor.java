package com.github.cnzhoutao.service;

import com.github.easy_http.service.HttpMethodPostProcessor;

/**
 * @author zt
 * @Date: 2021/2/23 7:38 下午
 */
public class HttpMethodInterceptor implements HttpMethodPostProcessor {
    @Override
    public void onException(Exception ex) {
        System.out.println("异常");
    }

    @Override
    public void after(Object[] args) {
        System.out.println("后");
    }

    @Override
    public void before(Object[] args) {
        System.out.println("前");
    }
}
