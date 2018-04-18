package com.polaris.inventory.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "role", schema = "polariserp")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ROLECODE")
    private Integer rolecode;

    @ManyToMany(mappedBy="users")
    private List<User> users;
    
    @ManyToMany
    @JoinTable(name="ROLE_Privilege", joinColumns = @JoinColumn(name="ROLE_ID"), inverseJoinColumns = @JoinColumn(name="PRIVILEGE_ID"))
    private List<Privilege> privileges;

	public Long getId() {
        return id;
    }

    public Integer getRolecode() {
        return rolecode;
    }

    public void setRolecode(Integer rolecode) {
        this.rolecode = rolecode;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }
}
