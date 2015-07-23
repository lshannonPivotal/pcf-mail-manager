package io.pivotal.fe.pcf.mailmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mangofactory.swagger.plugin.EnableSwagger;

@SpringBootApplication
@EnableSwagger
public class MailListManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailListManagerApplication.class, args);
    }
}
