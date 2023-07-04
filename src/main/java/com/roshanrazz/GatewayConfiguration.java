import org.springframework.cloud.gateway.config.GlobalCorsProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public GlobalCorsProperties globalCorsProperties() {
        GlobalCorsProperties corsProperties = new GlobalCorsProperties();
        corsProperties.setAllowedOrigins("*"); // Allow requests from all origins
        corsProperties.setAllowedMethods("*"); // Allow all HTTP methods
        corsProperties.setAllowedHeaders("*"); // Allow all headers
        return corsProperties;
    }
}
