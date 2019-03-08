package com.kyunghwan.controller;

import com.kyunghwan.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService baordService;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("boardList", baordService.findBoardList());
        return "/board/list";
    }

    @GetMapping({"", "/"})
    public String board(@RequestParam(value = "idx", defaultValue = "0") Long idx, Model model){
        model.addAttribute("board", baordService.findByIdx(idx));
        return "/board/form";
    }
}
