package net.ruixin.test;

import net.ruixin.criteria.domain.User;
import org.junit.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public class UserTest extends ApplicationTest {

    @Test
    public void testAddUser() {
        User tom = new User();
        tom.setId(1L);
        tom.setName("Tom");
        tom.setAge(20);
        userRepository.save(tom);
        User jim = new User();
        jim.setId(2L);
        jim.setName("Jim");
        jim.setAge(21);
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
    public void testGetById() {
        Optional<User> user = userRepository.findById(1L);
        System.out.println(user.get());
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

    @Test
    public void testGetUserByOrganName() {
        List<User> users = userRepository.getUserByOrganName();
        users.forEach(User::toString);
    }
}
