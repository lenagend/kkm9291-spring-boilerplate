package com.kkm9291.kkm9291springboilerplate.service.domain;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 메뉴의 고유 식별자

    private String name; // 메뉴의 이름

    private String description; // 메뉴에 대한 설명

    private Boolean active; // 메뉴 활성화 상태 (사용/미사용)

    private String linkType; // 링크 유형 ('EXTERNAL' 또는 'INTERNAL')

    private String link; // 외부 URL 또는 내부 경로

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Menu parent; // 상위 메뉴 (없을 경우 null)

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Menu> children; // 하위 메뉴 목록

    private Integer order; // 메뉴의 정렬 순서

    private String icon; // 메뉴 아이콘 (이미지 URL 등)

    private String type; // 메뉴의 유형 (예: 'HEADER', 'FOOTER', 'SIDEBAR')

    private String visibility; // 메뉴의 가시성 ('PUBLIC', 'PROTECTED', 'PRIVATE')

    private String target; // 링크가 열릴 방법 ('_blank', '_self', '_parent', '_top')

    private String tooltip; // 메뉴 항목에 대한 추가 정보를 제공하는 툴팁 텍스트

    private String badge; // 메뉴 항목에 대한 추가 상태를 나타내는 배지 텍스트

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "menu_permissions",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private Set<Permission> permissions = new HashSet<>(); // 메뉴 접근 권한

    private String cssClass; // 메뉴 항목에 대한 커스텀 CSS 클래스

    @CreationTimestamp
    private LocalDateTime createdDate; // 메뉴 생성 날짜

    @UpdateTimestamp
    private LocalDateTime modifiedDate; // 메뉴 수정 날짜

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
