package ua.com.codespace.spring.aop.model;

public class Door {

    public void open() {
        System.out.println("Door opened");
    }

    public void close(String name) {
        if(name.equals("Oleksandr")) {
            throw new IllegalStateException();
        }
        System.out.println(name + " closed door");
    }

}
