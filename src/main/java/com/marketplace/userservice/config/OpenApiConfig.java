package com.marketplace.userservice.config;

import com.marketplace.userservice.constants.OpenAPIConstants;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Muhammed Shaheer
 * @since 06 December 2020
 */

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title(OpenAPIConstants.API_SPEC_TITLE)
                        .description(OpenAPIConstants.API_SPEC_DESCRIPTION)
                        .version(OpenAPIConstants.API_SPEC_VERSION)
                );
    }
}
