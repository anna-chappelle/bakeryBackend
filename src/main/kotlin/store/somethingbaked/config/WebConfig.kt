package store.somethingbaked.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.config.annotation.CorsRegistry

@Configuration
class WebConfig : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins(
                "https://bakerywebsitefrontend-production.up.railway.app/",
                "https://somethingbaked.store",
                "http://localhost:4200"
            )
            .allowedMethods("*")
            .allowedHeaders("*")
            .allowCredentials(true)
    }
}
