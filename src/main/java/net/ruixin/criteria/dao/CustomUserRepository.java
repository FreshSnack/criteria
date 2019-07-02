package net.ruixin.criteria.dao;

import net.ruixin.criteria.domain.User;

import java.util.List;

public interface CustomUserRepository {

    void customSaveUser(User user);

    List<User> criteriaQuery();

    List<User> getUserByOrganName();
}
