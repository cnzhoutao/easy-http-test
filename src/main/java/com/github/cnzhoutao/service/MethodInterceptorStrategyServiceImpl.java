package com.github.cnzhoutao.service;

import com.github.easy_http.service.HttpMethodPostProcessor;
import com.github.easy_http.service.MethodInterceptorStrategyService;
import org.springframework.stereotype.Service;

/**
 * @author zt
 * @Date: 2021/2/23 7:37 下午
 */
@Service
public class MethodInterceptorStrategyServiceImpl implements MethodInterceptorStrategyService {
    @Override
    public HttpMethodPostProcessor supplyMethod(String methodName) {
        System.out.println("方法筛选策略====>" + methodName);
        return new HttpMethodInterceptor();
    }
}
