package net.ruixin.criteria.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SYS_ROLE")
@Getter
@Setter
public class Role {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CODE")
    private String code;
    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name="USER_ROLE", joinColumns = @JoinColumn(name="ROLE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name="USER_ID", referencedColumnName = "ID"))
    private List<User> userList;
}
