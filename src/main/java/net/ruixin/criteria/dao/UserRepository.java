package net.ruixin.criteria.dao;

import net.ruixin.criteria.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long>, CustomUserRepository {

}
