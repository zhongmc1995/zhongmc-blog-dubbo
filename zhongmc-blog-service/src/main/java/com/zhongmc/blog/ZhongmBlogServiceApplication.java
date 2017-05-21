package com.zhongmc.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhongmc on 2017/5/20.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zhongmc.blog.dao")
@ImportResource("classpath:dubbo.xml")
public class ZhongmBlogServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZhongmBlogServiceApplication.class, args);
    }
}
