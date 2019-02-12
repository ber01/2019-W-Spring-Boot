package com.kyunghwan.repository;

import com.kyunghwan.domain.Board;
import com.kyunghwan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>{
    Board findByUser(User user);
}
