package org.shop.configs;

import org.shop.api.*;
import org.shop.api.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ServiceConfig {

    @Autowired
    RepositoryConfig repositoryConfig;

    @Bean
    public ItemService itemService() {
        return new ItemServiceImpl(repositoryConfig.itemRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl();
    }

    @Bean
    public ProductService productService() {
        return new ProductServiceImpl(repositoryConfig.productRepository());
    }

    @Bean
    public ProposalService proposalService() {
        return new ProposalServiceImpl(repositoryConfig.proposalRepository());
    }

    @Bean
    public SellerService sellerService() {
        return new SellerServiceImpl();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

}
