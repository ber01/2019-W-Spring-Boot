package com.kyunghwan.repository;

import com.kyunghwan.domain.Board;
import com.kyunghwan.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long>{
    Board findByUser(User user);
    Page<Board> findAllByOrderByIdxDesc(Pageable pageable);
    // List<Board> findAllByOrderByIdxDesc();
}
