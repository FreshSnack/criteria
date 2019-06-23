package net.ruixin.criteria.repository;

import net.ruixin.criteria.entity.User;

import java.util.List;

public interface CustomUserRepository {

    void customSaveUser(User user);

    List<User> criteriaQuery();
}
