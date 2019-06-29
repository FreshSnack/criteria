package net.ruixin.test;

import net.ruixin.criteria.CriteriaApplication;
import net.ruixin.criteria.dao.OrganRepository;
import net.ruixin.criteria.dao.RoleRepository;
import net.ruixin.criteria.dao.UserRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CriteriaApplication.class)
public class ApplicationTest {

    @Autowired
    protected UserRepository userRepository;

    @Autowired
    protected OrganRepository organRepository;

    @Autowired
    protected RoleRepository roleRepository;
}