package com.github.cnzhoutao.api;

import com.github.easy_http.annotation.Api;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zt
 * @Date: 2021/2/10 10:30 上午
 */
@Api(url = "", hostName = "www.jianshu.com", https = true)
public interface JianShuApi {

    @GetMapping(value = "/")
    String indexPage();
}
