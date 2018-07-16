package org.shop.configs;


import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("org.shop.aspect")
@Import({InitializerConfig.class, RepositoryConfig.class, ServiceConfig.class})
public class AppConfig {


}
