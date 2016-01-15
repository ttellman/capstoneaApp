package com.videostore.model;

import javax.persistence.*;

/**
 * Created by Tim on 1/14/2016.
 */
@Entity
@Table(name = "user_roles", schema = "sakila", catalog = "")
public class UserRoles {
    private Integer userRoleId;
    private String username;
    private String role;

    @Id
    @Column(name = "user_role_id")
    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "ROLE")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoles userRoles = (UserRoles) o;

        if (userRoleId != null ? !userRoleId.equals(userRoles.userRoleId) : userRoles.userRoleId != null) return false;
        if (username != null ? !username.equals(userRoles.username) : userRoles.username != null) return false;
        if (role != null ? !role.equals(userRoles.role) : userRoles.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userRoleId != null ? userRoleId.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
