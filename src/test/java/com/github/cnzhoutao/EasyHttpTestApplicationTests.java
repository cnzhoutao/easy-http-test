package com.github.cnzhoutao;

import com.github.cnzhoutao.api.JianShuApi;
import com.github.cnzhoutao.api.LoginApi;
import com.github.cnzhoutao.dto.UserDTO;
import com.github.easy_http.util.CHThreadLocalUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class EasyHttpTestApplicationTests {

    @Resource
    private JianShuApi jianShuApi;

    @Resource
    private LoginApi loginApi;

    @Test
    public void testJianshu() {
        String s = jianShuApi.indexPage();
        System.out.println(s);
    }

    @Test
    public void testLogin(){
        UserDTO userDTO=new UserDTO("cnzhoutao","github");
        String result = loginApi.login(userDTO);
        System.out.println(result);
        CHThreadLocalUtils.clear();
    }

}
