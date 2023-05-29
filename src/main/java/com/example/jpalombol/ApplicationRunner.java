package com.example.jpalombol;

import org.postgresql.jdbc2.optional.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean(ConnectionPool.class));
    }
    


}
