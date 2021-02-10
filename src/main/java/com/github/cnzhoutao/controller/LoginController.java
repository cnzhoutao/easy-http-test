package com.github.cnzhoutao.controller;

import com.github.cnzhoutao.dto.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zt
 * @Date: 2021/2/10 12:04 下午
 */
@RestController
@RequestMapping(value = "/test")
public class LoginController {

    @PostMapping(value = "/login")
    public String login(@RequestBody UserDTO userDTO) {
        System.out.println("接收到登录请求:用户名:" + userDTO.getUserName() + "----密码：" + userDTO.getPwd());
        return "{\"res\":\"登录成功\"}";

    }
}
