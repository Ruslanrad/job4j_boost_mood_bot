package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.BeanNameAware;
import ru.job4j.bmb.content.Content;

@Service
public class BotCommandHandler implements BeanNameAware {
    private String beanName;

    @PostConstruct
    public void init() {
        System.out.println("Bean " + beanName + " is going through init.");
    }

    void receive(Content content) {
        System.out.println(content);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean " + beanName + " will be destroyed now.");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}