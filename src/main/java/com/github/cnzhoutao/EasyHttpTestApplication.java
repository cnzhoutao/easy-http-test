package com.github.cnzhoutao;

import com.github.easy_http.annotation.EnableApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApi(basePackages = {"com.github.cnzhoutao.api"})
public class EasyHttpTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyHttpTestApplication.class, args);
    }

}
