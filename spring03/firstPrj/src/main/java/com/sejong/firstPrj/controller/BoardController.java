package com.sejong.firstPrj.controller;
import com.sejong.firstPrj.dto.Board;
import com.sejong.firstPrj.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public List<Board> findAll() {
        List<Board> result = boardService.getAllBoardList();
        for( Board b1 : result ) {
            System.out.println(b1.toString());
        }
        return boardService.getAllBoardList();
    }

}