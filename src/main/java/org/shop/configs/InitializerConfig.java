package org.shop.configs;

import org.shop.*;
import org.shop.api.ProductService;
import org.shop.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration

public class InitializerConfig {

    @Autowired
    ServiceConfig serviceConfig;

    @Bean(initMethod="initData")
    public DataInitializer dataInitializer(){
        return new DataInitializer();
    }

    @Bean
    public ProductInitializer productInitializer(){
        return new ProductInitializer(serviceConfig.productService());
    }

    @Bean("proposalInitializer")
    public ProposalInitializer proposalInitializer(){
        return new ProposalInitializer();
    }

    @Bean
    public SellerInitializer sellerInitializer(){
        return new SellerInitializer();
    }

    @Bean
    public Map<Long, String> sellerNames(){
        Map<Long,String> map = new HashMap<>();
        map.put(1L, "Pupa");
        map.put(2L, "Lupa");
        return map;
    }

    @Bean
    public UserInitializer userInitializer(){
        return new UserInitializer(serviceConfig.userService());
    }
}
