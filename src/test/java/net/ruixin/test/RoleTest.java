package net.ruixin.test;

import net.ruixin.criteria.domain.Role;
import net.ruixin.criteria.domain.User;
import org.junit.Test;

import java.util.Arrays;

public class RoleTest extends ApplicationTest {

    @Test
    public void testAddRole() {
        Role role = new Role();
        role.setId(1L);
        role.setName("经理");
        role.setCode("manager");
        roleRepository.save(role);
    }

    @Test
    public void testAddUserRole() {
        Role role = roleRepository.findById(1L).get();
        User user1 = userRepository.findById(1L).get();
        User user2 = userRepository.findById(2L).get();
        role.setUserList(Arrays.asList(user1, user2));
        roleRepository.save(role);
    }

    @Test
    public void testGetRole() {
        Role role = roleRepository.findById(1L).get();
        System.out.println(role);
    }
}
