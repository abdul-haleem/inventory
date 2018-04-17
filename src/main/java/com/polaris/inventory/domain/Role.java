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
    private List<User>users;
    
    @ManyToMany
    @JoinTable(name="ROLE_Privilege", joinColumns = @JoinColumn(name="ROLE_ID"), inverseJoinColumns = @JoinColumn(name="PRIVILEGE_ID"))
    private List<Privilege>privileges;

    public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Long getId() {
        return id;
    }

    public Integer getRolecode() {
        return rolecode;
    }

    public void setRolecode(Integer rolecode) {
        this.rolecode = rolecode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (id != role.id) return false;
        if (rolecode != null ? !rolecode.equals(role.rolecode) : role.rolecode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (rolecode != null ? rolecode.hashCode() : 0);
        return result;
    }
}
