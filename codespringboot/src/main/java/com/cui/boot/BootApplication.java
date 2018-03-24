package com.cui.boot;

import com.cui.boot.model.TestModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author cuishixiang
 * @date 2018-01-30
 */
@SpringBootApplication
@RestController
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Value("${book.name}")
    private String bookName;

    @Resource
    private TestModel testModel;

    @RequestMapping("/")
    public String index() {
        return new Date().toLocaleString() + "\t Hello Spring Boot \t" + bookName + testModel.getName();
    }

}
