package net.ruixin.criteria.repository;

import lombok.extern.slf4j.Slf4j;
import net.ruixin.criteria.entity.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

//        Root<User> root = builder.
//        builder.sum(builder.abs())
//        query.where(new Expression())
//        query.select(Selection.);
        return null;
    }

}
