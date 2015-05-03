package com.azvasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by mrugen on 5/3/15.
 */
@EnableScheduling
@SpringBootApplication()
@ComponentScan()
public class CollectorConfig {
    public static void main(String... args){
        SpringApplication.run(CollectorConfig.class,args);
    }
}
