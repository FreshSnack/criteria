package net.ruixin.criteria;

import net.ruixin.criteria.entity.User;
import net.ruixin.criteria.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CriteriaApplicationTests {


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
}
