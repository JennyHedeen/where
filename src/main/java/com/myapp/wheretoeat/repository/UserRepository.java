package com.myapp.wheretoeat.repository;

import com.myapp.wheretoeat.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepository {

    public User save(User user) {
        return null;
    }

    public boolean delete(int id) {
        return false;
    }

    public User get(int id) {
        return null;
    }

    public List<User> getAll() {
        return null;
    }
}
