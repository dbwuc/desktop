package com.hedian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@MapperScan({"com.hedian.mapper"})
@SpringBootApplication
public class DeviceDockingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeviceDockingApplication.class, args);
    }

}
