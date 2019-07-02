package net.ruixin.criteria.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SYS_USER")
@Getter
@Setter
public class User {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private int age;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "ORGAN_ID")
    private Organ organ;
    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JoinTable(name="USER_ROLE", joinColumns = @JoinColumn(name="USER_ID", referencedColumnName = "ID"),
    inverseJoinColumns = @JoinColumn(name="ROLE_ID", referencedColumnName = "ID"))
    private List<Role> roleList;
    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID")
    private UserInfo userInfo;
}
