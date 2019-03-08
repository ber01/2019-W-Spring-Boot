package com.kyunghwan.controller;

import com.kyunghwan.domain.Board;
import com.kyunghwan.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardRestController {

    private BoardRepository boardRepository;

    BoardRestController(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getBoards(){
        List<Board> boards = boardRepository.findAll();

        return ResponseEntity.ok(boards);
    }

    @PostMapping
    public ResponseEntity<?> postBoards(@RequestBody Board board){

        board.setCreatedDateNow();

        boardRepository.save(board);

        return new ResponseEntity<>("{}", HttpStatus.CREATED);
    }

    @PutMapping("{idx}")
    public ResponseEntity<?> putBoard(@PathVariable("idx")Long idx, @RequestBody Board board){
        Board persistBoard = boardRepository.getOne(idx);

        persistBoard.update(board);
        boardRepository.save(persistBoard);

        return new ResponseEntity<>("{}", HttpStatus.OK);
    }

    @DeleteMapping("{idx}")
    public ResponseEntity<?> deleteBoard(@PathVariable("idx")Long idx){
        boardRepository.deleteById(idx);

        return new ResponseEntity<>("{}", HttpStatus.OK);
    }
}