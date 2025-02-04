package com.goaleaf.communities;

import com.github.pplociennik.commons.audit.DefaultAuditor;
import com.github.pplociennik.modinfo.config.ModuleInfoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaAuditing( auditorAwareRef = "auditorProvider" )
@Import( value = { ModuleInfoConfiguration.class } )
public class GlfCommunitiesApplication {

    public static void main( String[] args ) {
        SpringApplication.run( GlfCommunitiesApplication.class, args );
    }

    @Bean
    AuditorAware< String > auditorProvider() {
        return new DefaultAuditor();
    }
}
