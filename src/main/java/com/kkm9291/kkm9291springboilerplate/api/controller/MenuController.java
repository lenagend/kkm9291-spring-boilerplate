package com.kkm9291.kkm9291springboilerplate.api.controller;

import com.kkm9291.kkm9291springboilerplate.api.dto.MenuDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menus")
public class MenuController {


    // 1. 모든 메뉴 조회 (사용자 권한에 따라 visibility 고려)
    @GetMapping
    public List<MenuDTO> getAllMenus(@RequestParam String userRole) {
        // 1.1. 서비스에서 모든 메뉴를 조회하고, 사용자 권한에 따라 필터링
        // List<MenuDTO> menus = menuService.getAllMenus(userRole);
        // return menus;
    }

    // 2. 특정 메뉴 조회
    @GetMapping("/{id}")
    public MenuDTO getMenuById(@PathVariable Long id) {
        // 2.1. 서비스에서 특정 메뉴를 조회
        // MenuDTO menu = menuService.getMenuById(id);
        // return menu;
    }

    // 3. 메뉴 생성
    @PostMapping
    public MenuDTO createMenu(@RequestBody MenuDTO menuDTO) {
        // 3.1. 서비스에서 새로운 메뉴 생성
        // MenuDTO createdMenu = menuService.createMenu(menuDTO);
        // return createdMenu;
    }

    // 4. 메뉴 수정
    @PutMapping("/{id}")
    public MenuDTO updateMenu(@PathVariable Long id, @RequestBody MenuDTO menuDTO) {
        // 4.1. 서비스에서 기존 메뉴 수정
        // MenuDTO updatedMenu = menuService.updateMenu(id, menuDTO);
        // return updatedMenu;
    }

    // 5. 메뉴 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMenu(@PathVariable Long id) {
        // 5.1. 서비스에서 메뉴 삭제
        // menuService.deleteMenu(id);
        // return ResponseEntity.ok().build();
    }

    // 6. 특정 메뉴의 하위 메뉴 조회
    @GetMapping("/{id}/children")
    public List<MenuDTO> getMenuChildren(@PathVariable Long id) {
        // 6.1. 서비스에서 특정 메뉴의 하위 메뉴를 조회
        // List<MenuDTO> children = menuService.getMenuChildren(id);
        // return children;
    }

    // 7. 메뉴 순서 변경
    @PostMapping("/{id}/order")
    public MenuDTO changeMenuOrder(@PathVariable Long id, @RequestParam Integer newOrder) {
        // 7.1. 서비스에서 메뉴 순서 변경
        // MenuDTO reorderedMenu = menuService.changeMenuOrder(id, newOrder);
        // return reorderedMenu;
    }
}
