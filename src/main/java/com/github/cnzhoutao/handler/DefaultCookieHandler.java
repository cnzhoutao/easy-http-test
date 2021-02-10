package com.github.cnzhoutao.handler;

import com.github.easy_http.service.CookieOpService;

import java.util.Map;

/**
 * @author zt
 * @Date: 2021/2/10 12:48 下午
 */
public class DefaultCookieHandler implements CookieOpService {
    @Override
    public void opCookie(Map<String, String> map) {
        map.put("xxx", "xxx");
    }
}
