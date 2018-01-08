package com.myapp.wheretoeat.web;


import com.myapp.wheretoeat.model.User;
import com.myapp.wheretoeat.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserRestContoller {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService service;


}
