package com.cardinal.project.human_isekai_transfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardinal.project.human_isekai_transfer.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
