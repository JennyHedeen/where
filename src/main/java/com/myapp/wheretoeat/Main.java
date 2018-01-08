package com.myapp.wheretoeat;

import com.myapp.wheretoeat.model.Role;
import com.myapp.wheretoeat.model.User;
import com.myapp.wheretoeat.web.AdminRestContoller;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml", "spring/spring-db.xml")) {

            AdminRestContoller adminUserController = appCtx.getBean(AdminRestContoller.class);
            adminUserController.create(new User(null, "userName", "email", "password", Role.ROLE_USER));
            System.out.println();
            adminUserController.delete(1001);
        }
    }
}
