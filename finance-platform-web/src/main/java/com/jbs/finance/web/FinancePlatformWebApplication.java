package com.jbs.finance.web;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "hermes", autoRefreshed = true)
public class FinancePlatformWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancePlatformWebApplication.class, args);
    }

}
