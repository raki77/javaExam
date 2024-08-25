package com.sejong.firstPrj.service;

import com.sejong.firstPrj.dto.Board;
import com.sejong.firstPrj.dao.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<Board> getAllBoardList() {
        return boardMapper.getAllBoardList();
    }

}