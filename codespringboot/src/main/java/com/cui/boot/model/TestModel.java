package com.cui.boot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cuishixiang
 * @date 2018-02-02
 */
@Component
@ConfigurationProperties(prefix = "author")
public class TestModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
