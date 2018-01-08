package com.myapp.wheretoeat.web;

import com.myapp.wheretoeat.model.User;
import com.myapp.wheretoeat.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.myapp.wheretoeat.util.ValidationUtil.assureIdConsistent;
import static com.myapp.wheretoeat.util.ValidationUtil.checkNew;

public class AdminRestContoller {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    private UserService service;

    public List<User> getAll() {
        log.info("getAll");
        return service.getAll();
    }

    public User get(int id) {
        log.info("get {}", id);
        return service.get(id);
    }

    public User create(User user) {
        log.info("create {}", user);
        checkNew(user);
        return service.create(user);
    }

    public void delete(int id) {
        log.info("delete {}", id);
        service.delete(id);
    }

    public void update(User user, int id) {
        log.info("update {} with id={}", user, id);
        assureIdConsistent(user, id);
        service.update(user);
    }

}
