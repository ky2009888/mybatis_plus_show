package com.ky2009888.apps;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 默认启动类
 *
 * @author Lenovo
 */
@SpringBootApplication
public class MybatisPlusShowApplication {
    /**
     * 主入口运行方法
     *
     * @param args 命令行 参数.
     */
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusShowApplication.class, args);
    }

}
