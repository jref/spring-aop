package ua.com.codespace.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.com.codespace.spring.aop.config.SpringConfig;
import ua.com.codespace.spring.aop.model.Door;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Door door = context.getBean(Door.class);
        door.open();
        door.close("Ivan");
        try {
            door.close("Oleksandr");
        } catch (RuntimeException e) {

        }
        context.close();
    }
}
