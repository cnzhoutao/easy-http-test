package com.github.cnzhoutao.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zt
 * @Date: 2021/2/10 12:05 下午
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    //用户名
    private String userName;

    //密码
    private String pwd;

}
