package com.kyunghwan.service;

import com.kyunghwan.domain.Board;
import com.kyunghwan.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public List<Board> findBoardList() {
        return boardRepository.findAll();
    }

    public Board findByIdx(Long idx) {
        return boardRepository.findById(idx).orElse(new Board());
    }
}