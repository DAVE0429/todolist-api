package com.api.study.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {

        Info info = new Info()
                .title("study REST API")
                .description("study Service")
                .contact(new Contact().name("study").url("/").email(""))
                .license(new License().name("License of name").url("/"))
                .version("ECONOMY SERVICE API Doc v1.0");

        return new OpenAPI()
                .info(info);
    }
}
