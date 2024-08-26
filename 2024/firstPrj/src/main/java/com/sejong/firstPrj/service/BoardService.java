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
<<<<<<< HEAD
=======
//        List result = boardMapper.getAllBoardList();
//        for(int i=0; i < result.size(); i++) {
//            System.out.print("result : " + ((Board) result.get(i)).getName() );
//        }
>>>>>>> 4fc6588c0ff5736c80c2de3ea9b04ca1bceec9aa
        return boardMapper.getAllBoardList();
    }

}