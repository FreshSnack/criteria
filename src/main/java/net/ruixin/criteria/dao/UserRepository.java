package net.ruixin.criteria.dao;

import net.ruixin.criteria.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author dingmx
 * @date 2019/6/22 21:06
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long>, CustomUserRepository {

}
