package net.ruixin.criteria.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SYS_USER_INFO")
@Getter
@Setter
public class UserInfo {
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "NO")
    private String name;
}
