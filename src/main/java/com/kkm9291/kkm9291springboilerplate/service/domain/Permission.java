package com.kkm9291.kkm9291springboilerplate.service.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // 권한 이름, 예: "ROLE_USER", "ROLE_ADMIN"

    @ManyToMany(mappedBy = "permissions")
    private Set<Menu> menus; // 이 권한을 갖는 메뉴들

    // Constructors, Getters, Setters
    public Permission() {}

    public Permission(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }
}