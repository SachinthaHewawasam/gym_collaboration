package com.example.gymcollaboration.config;//package com.example.gymcollaboration.config;
//
//import jdk.javadoc.doclet.Doclet;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Doclet api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.gymcollab"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("GymCollab API")
//                .description("API for GymCollab application")
//                .version("1.0.0")
//                .build();
//    }
//}
//
