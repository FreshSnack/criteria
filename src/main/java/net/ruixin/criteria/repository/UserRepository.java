package net.ruixin.criteria.repository;

import net.ruixin.criteria.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author dingmx
 * @date 2019/6/22 21:06
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
