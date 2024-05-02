package com.ch.anyway.domain.board.entity;

import com.ch.anyway.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column
    private String title;
    @Column
    private String content;
    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    @OneToMany
    private List<Coment> comentList;

}
