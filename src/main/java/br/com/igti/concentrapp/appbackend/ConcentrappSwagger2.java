package br.com.igti.concentrapp.appbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ConcentrappSwagger2 {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ConcentrappSwagger2.class, args);
    }

    @Bean
    public springfox.documentation.spring.web.plugins.Docket docket() {
        Docket docket = new Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2);
        return docket.apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        @SuppressWarnings("deprecation")
        ApiInfo apiInfo = new ApiInfo("ConcentrApp REST API", "Lista de serviços do aplicativo ConcentrApp", "Versão API 1.0",
                "Termos de uso", "souza1981@gmail.com.com", "API License", "API License URL");
        return apiInfo;
    }

}
