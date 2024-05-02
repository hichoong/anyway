package com.ch.anyway.domain.board.entity;

public enum BoardType {
    NOTICE("정보게시판"),FREE("자유게시판");
    private String description;

    BoardType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
