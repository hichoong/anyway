package com.ch.anyway.domain.member.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    @Column
    private String username;
    @Column
    private String password;

    @Column
    private String email;

    @Embedded
    private Address address;
}
