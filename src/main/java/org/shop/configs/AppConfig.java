package org.shop.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({ InitializerConfig.class, RepositoryConfig.class, ServiceConfig.class })
public class AppConfig {
}
