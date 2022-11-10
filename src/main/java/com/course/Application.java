package com.course;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PreDestroy;

/**
 * @ClassName Application
 * @Description TODO
 * @Author @0_0
 * @Date 2022/10/25 17:54
 * @Version 1.0
 */
@Slf4j
@ComponentScan
@EnableScheduling
@EnableAutoConfiguration
@Controller
//@SpringBootApplication
public class Application {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        Application.context = SpringApplication.run(Application.class, args);
        log.info("项目启动成功");
    }

    @PreDestroy
    public void close(){
        Application.context.close();
    }
}
