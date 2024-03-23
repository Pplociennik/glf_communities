package com.goaleaf.communities;

import com.github.pplociennik.commons.audit.AuditAwareImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing( auditorAwareRef = "auditAwareImpl" )
public class GlfCommunitiesApplication {

    public static void main( String[] args ) {
        SpringApplication.run( GlfCommunitiesApplication.class, args );
    }

    @Bean
    AuditorAware< String > auditAwareImpl() {
        return new AuditAwareImpl();
    }
}
