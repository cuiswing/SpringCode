package com.cui.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Spring Boot项目启动类
 *
 * @author cuishixiang
 * @date 2018-02-27
 */
@SpringBootApplication
@ImportResource(locations = {"task.xml"})
public class JobApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class, args);
    }
}
