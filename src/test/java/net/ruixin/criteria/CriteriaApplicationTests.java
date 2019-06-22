package net.ruixin.criteria;

import net.ruixin.criteria.entity.User;
import net.ruixin.criteria.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CriteriaApplicationTests {


    @Autowired
    UserRepository userRepository;

    @Test
    public void testAddUser() {
        User user = new User(1L, "Tom", 20);
        userRepository.save(user);
    }
}
