package net.ruixin.criteria.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SYS_ORGAN")
@Getter
@Setter
public class Organ {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CODE")
    private String code;
//    @Column(name = "PARENT_ID")
//    private Long parentId;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "PARENT_ID")
    private Organ parent;
    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "PARENT_ID")
    private List<Organ> organList;
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "ORGAN_ID")
    private List<User> userList;
}
