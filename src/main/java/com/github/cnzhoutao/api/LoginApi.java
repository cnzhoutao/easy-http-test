package com.github.cnzhoutao.api;

import com.github.cnzhoutao.dto.UserDTO;
import com.github.cnzhoutao.handler.DefaultCookieHandler;
import com.github.cnzhoutao.handler.DefaultHeaderHandler;
import com.github.easy_http.annotation.Api;
import com.github.easy_http.annotation.CookieHandler;
import com.github.easy_http.annotation.HeaderHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author zt
 * @Date: 2021/2/10 12:08 下午
 */
@Api(url = "/test", hostName = "127.0.0.1:8080", https = false)
public interface LoginApi {

    @PostMapping(value = "/login")
    @CookieHandler(cookieHandlerCls = DefaultCookieHandler.class)
    @HeaderHandler(headerHandlerCls = DefaultHeaderHandler.class)
    String login(@RequestBody UserDTO userDTO);

}
