package com.cardinal.project.human_isekai_transfer.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cardinal.project.human_isekai_transfer.entity.Player;
import com.cardinal.project.human_isekai_transfer.model.RegisterPlayerRequest;
import com.cardinal.project.human_isekai_transfer.repository.PlayerRepository;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private Validator validator;

    @Transactional
    public void register(RegisterPlayerRequest request) {
        Set<ConstraintViolation<RegisterPlayerRequest>> constraintViolations = validator.validate(request);
        if(constraintViolations.size() != 0) {
            throw new ConstraintViolationException(constraintViolations);
        }

        Player player = new Player();
        player.setFirstName(request.getFirstName());
        player.setLastName(request.getLastName());
        player.setJobId(request.getJobId());
        player.setWorldId(request.getWorldId());
        player.setCoin(request.getCoin());

        playerRepository.save(player);

    }
}
