package vn.com.v1.springbootdockerhub;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableCaching
@EnableAsync
@SpringBootApplication
@EnableZeebeClient
//@ZeebeDeployment(resources = "classpath:sample.bpmn")
public class SpringBootDockerHubApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootDockerHubApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerHubApplication.class, args);
    }

}
