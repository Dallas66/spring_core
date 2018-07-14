package org.shop;


import org.shop.api.ProductService;
import org.shop.api.SellerService;
import org.shop.api.UserService;
import org.shop.configs.AppConfig;
import org.shop.repository.map.OrderMapRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        //TODO: implement using Spring Framework ApplicationContext

        ApplicationContext ctx = new AnnotationConfigApplicationContext (AppConfig.class);

        System.out.println(ctx.getBean(OrderMapRepository.class).getSequence());
        System.out.println(ctx.getBean(ProductService.class).getProducts());
        System.out.println(ctx.getBean(UserService.class).getUsers());
        System.out.println(ctx.getBean(SellerService.class).getSellers());
    }

}
