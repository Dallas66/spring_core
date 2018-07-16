package org.shop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* org.shop.*.*.*())")
    public void allInitMethod(JoinPoint joinPoint) {
        logger.info("init method : " + joinPoint.getSignature().getName() + " started");


    }


}
