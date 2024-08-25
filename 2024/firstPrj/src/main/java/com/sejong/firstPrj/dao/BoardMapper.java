package com.sejong.firstPrj.dao;

import com.sejong.firstPrj.dto.Board;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> getAllBoardList();
}
