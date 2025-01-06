package ru.job4j.bmb.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.jvnet.hk2.annotations.Service;
import ru.job4j.bmb.content.Content;

@Service
public class BotCommandHandler {

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }

    void receive(Content content) {
        System.out.println(content);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will be destroyed now.");
    }
}