package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by yurii on 10.09.17.
 */
@ComponentScan(value = "app")
@EntityScan(basePackages = "app/model")
@SpringBootApplication
public class WebsiteMonitoringApp {
    public static void main(String[] args) {
        SpringApplication.run(WebsiteMonitoringApp.class, args);
    }
}
