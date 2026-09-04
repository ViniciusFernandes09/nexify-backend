package com.projects.nexify.dto;

import com.projects.nexify.entities.User;

public class ClientDTO {

    private Long id;
    private String name;

    public ClientDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public ClientDTO(User entity) {
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
