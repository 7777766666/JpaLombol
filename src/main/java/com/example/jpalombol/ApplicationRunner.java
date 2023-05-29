package com.example.jpalombol;


import com.example.jpalombol.repository.dataBase.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("pool1"));
        System.out.println(context.getBean("pool2"));


//        Container container = new Container();

//        var connectionPool = container.get(ConnectionPool.class);
//        var userRepository = container.get(UserRepository.class);
//        CompanyRepository companyRepository = container.get(CompanyRepository.class);
//        Service service = container.get(Service.class);

//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        CompanyRepository companyRepository = new CompanyRepository(connectionPool);
//        Service service1 = new Service(userRepository, companyRepository);


//        var context = new ClassPathXmlApplicationContext("application.xml");
//        System.out.println(context.getBean(ConnectionPool.class));
    }
    


}
