package net.ruixin.test;

import net.ruixin.criteria.domain.Organ;
import org.junit.Test;

public class OrganTest extends ApplicationTest {

    @Test
    public void testAddOrgan() {
        Organ organ = new Organ();
        organ.setId(1L);
        organ.setName("瑞信软件");
        organ.setCode("rx");
        organRepository.save(organ);
    }

    @Test
    public void testAddChildOrgan() {
        Organ organ = new Organ();
        organ.setId(2L);
        organ.setName("基础软件部");
        organ.setCode("base");
//        organ.setParentId(1L);
        organRepository.save(organ);
        organ = new Organ();
        organ.setId(3L);
        organ.setName("监督组");
        organ.setCode("jd");
//        organ.setParentId(1L);
        organRepository.save(organ);
    }

    @Test
    public void testGetOrgan() {
        Organ organ = organRepository.findById(1L).get();
        System.out.println(organ);
    }
}
