package org.example.config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.example.profile.DevProfile;
import org.example.profile.ProductionProfile;
import org.example.profile.SystemProfile;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(
                    value = "example.profile.dev",
                    havingValue = "true")

    public SystemProfile devProfile() {
        return new DevProfile();
    }
    @Bean
    @ConditionalOnProperty(
            value = "example.profile.dev",
            havingValue = "false")

    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
