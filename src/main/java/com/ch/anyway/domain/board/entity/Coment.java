package com.ch.anyway.domain.board.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Coment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
