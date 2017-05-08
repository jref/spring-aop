package ua.com.codespace.spring.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ua.com.codespace.spring.aop.logger.DoorLogger;
import ua.com.codespace.spring.aop.model.Door;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

    @Bean
    public Door door() {
        return new Door();
    }

    @Bean
    public DoorLogger doorLogger() {
        return new DoorLogger();
    }

}
