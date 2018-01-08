package com.myapp.wheretoeat.service;

import com.myapp.wheretoeat.model.User;
import com.myapp.wheretoeat.repository.UserRepository;
import com.myapp.wheretoeat.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.myapp.wheretoeat.util.ValidationUtil.checkNotFoundWithId;


@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User create(User user) {
        return repository.save(user);
    }

    public void delete(int id) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id), id);
    }

    public User get(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public List<User> getAll() {
        return repository.getAll();
    }

    public void update(User user) {
        repository.save(user);
    }
}
