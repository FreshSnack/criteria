package net.ruixin.criteria;

import net.ruixin.criteria.domain.User;
import net.ruixin.criteria.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @author dingmx
 * @date 2019/6/27 15:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {



    @Autowired
    private UserRepository userRepository;

    @Test
    public void testAddUser() {
        User tom = new User(1L, "Tom", 20);
        userRepository.save(tom);
        User jim = new User(2L, "Jim", 21);
        userRepository.save(jim);
    }


    @Test
    public void testGetAll() {
//        List<User> users = null;
        Iterable<User> all = userRepository.findAll();
        all.forEach(System.out::println);
//        users.forEach(System.out::println);
//        while (users.iterator().hasNext()) {
//            System.out.println(users.iterator().next());
//        }
    }

    @Test
    public void testDeleteUser() {
//        Optional<User> user = userRepository.findById(1L);
        Optional<User> user = userRepository.findById(1L);
        if(user.isPresent()) {
            userRepository.delete(user.get());
        }
    }

    @Test
    public void testGetPage() {
        Pageable pageable = PageRequest.of(0,10);
        Page<User> all = userRepository.findAll(pageable);
        all.forEach(System.out::println);
    }

    @Test
    public void testCustomSaveUser() {
        User user = new User();
        user.setId(10L);
        user.setName("Lily");
        user.setAge(20);
        userRepository.customSaveUser(user);
    }

    @Test
    public void testCriteriaQuery() {
        List<User> users = userRepository.criteriaQuery();
        users.forEach(User::toString);
    }
}
