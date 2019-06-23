package net.ruixin.criteria.repository;

import net.ruixin.criteria.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dingmx
 * @date 2019/6/22 21:06
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long>, CustomUserRepository {

}
