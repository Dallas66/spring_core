package org.shop.configs;


import org.shop.repository.*;
import org.shop.repository.factory.UserRepositoryFactory;
import org.shop.repository.map.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")

public class RepositoryConfig {


    @Autowired
    Environment environment;

    @Bean
    public ItemRepository itemRepository() {
        return new ItemMapRepository();
    }

    @Bean
    public OrderRepository orderRepository() {
        OrderMapRepository orderRepository = new OrderMapRepository();
        orderRepository.setSequence(Long.parseLong(environment.getProperty("sequence")));
        return orderRepository;
    }

    @Bean
    public ProductRepository productRepository() {
        return new ProductMapRepository();
    }

    @Bean
    public ProposalRepository proposalRepository() {
        return new ProposalMapRepository();
    }

    @Bean
    public SellerRepository sellerRepository() {
        return new SellerMapRepository();
    }

    @Bean
    public UserRepositoryFactory userRepositoryFactory() {
        return new UserRepositoryFactory();
    }

    @Bean
    public UserRepository userRepository() {
        return userRepositoryFactory().createUserRepository();
    }
}
