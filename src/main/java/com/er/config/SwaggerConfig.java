package com.er.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.er"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
    }

    public ApiInfo metaInfo() {
        return new ApiInfo(
            "Desafio Sicredi: API CRUD em SpringBoot",
            "API para gerenciamento de votações em assembleias.",
            "1.0",
            "Terms of Service",
            new Contact("Repos do Projeto: ",
                    "https://github.com/EduardoReis7/assembleia-api",
                    "eduardodovigireis@gmail.com"),
            "Apache License Version 2.0",
            "https://www.apache.org/licesen.html",
            new ArrayList<>()
        );
    }
}
