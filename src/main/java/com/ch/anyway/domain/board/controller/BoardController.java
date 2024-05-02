package com.ch.anyway.domain.board.controller;

import com.ch.anyway.domain.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private BoardService boardServiceImpl;

}
