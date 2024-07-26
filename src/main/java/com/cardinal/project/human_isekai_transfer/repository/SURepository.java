package com.cardinal.project.human_isekai_transfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardinal.project.human_isekai_transfer.entity.Su;

@Repository
public interface SURepository extends JpaRepository<Su, String> {

}
