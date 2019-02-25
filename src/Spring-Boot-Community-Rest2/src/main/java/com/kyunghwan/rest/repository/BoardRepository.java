package com.kyunghwan.rest.repository;

import com.kyunghwan.rest.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
