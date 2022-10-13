package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;

public class ShoppingCartClientDTO {

    private Long id;
    private String name;

    public ShoppingCartClientDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ShoppingCartClientDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
