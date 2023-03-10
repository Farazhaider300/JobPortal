package com.example.JobPortal.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long roleId;
    @Column(name = "role_name")
    private String roleName;
    @OneToMany(mappedBy = "role")
    private List<UserRole> userRoles;

}
