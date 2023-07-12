package com.RiderRegistration.RiderRegistration.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

//@OpenAPIDefinition(info = @Info(title = "Rider registration API", version = "1.0", description = "Rider Details"))
//@SecurityScheme(name = "bearerAuth", scheme = "bearer", type = SecuritySchemeType.HTTP, bearerFormat = "JWT")
@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Developer",
                        email = "muhammadrehanulhaq463@gmail.com"
                ),
                description = "OpenApi documentation for Spring Project",
                title = "OpenApi specification - Rider registration",
                version = "1.0",
                license = @License(
                        name = "license name",
                        url = "license url"
                ),
                termsOfService = "terms of service "
        ),
        servers = {
                @Server(
                        description = "local ENV",
                        url = "http://localhost:8080"
                )
        })

@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        in = SecuritySchemeIn.HEADER
)
@Configuration
public class OpenApiConfig { }
