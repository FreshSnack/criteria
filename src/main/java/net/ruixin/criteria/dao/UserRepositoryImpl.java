package net.ruixin.criteria.dao;

import lombok.extern.slf4j.Slf4j;
import net.ruixin.criteria.domain.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;

@Slf4j
@Transactional
public class UserRepositoryImpl implements CustomUserRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public void customSaveUser(User user) {
        log.debug("start custom save user...");
        em.persist(user);
        log.debug("end custom save user...");
    }

    @Override
    public List<User> criteriaQuery() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        Predicate condition = builder.gt(root.get("age"), 20);
        query.where(condition);
        TypedQuery<User> q = em.createQuery(query);
        List<User> users = q.getResultList();
//        Root<User> root = builder.
//        builder.sum(builder.abs())
//        query.where(new Expression())
//        query.select(Selection.);
        return users;
    }

}
