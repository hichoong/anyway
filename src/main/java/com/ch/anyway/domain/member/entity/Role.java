package com.ch.anyway.domain.member.entity;

import lombok.Getter;

@Getter
public enum Role {
    ROLE_USER("ROLE_USER"),
    ROLE_ANONYMOUS("ROLE_ANONYMOUS"),
    ROLE_ADMIN("ROLE_ADMIN");

    private String role;

    Role(String role) {
        this.role = role;
    }
}
