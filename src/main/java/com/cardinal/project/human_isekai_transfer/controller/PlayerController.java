package com.cardinal.project.human_isekai_transfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cardinal.project.human_isekai_transfer.model.RegisterPlayerRequest;
import com.cardinal.project.human_isekai_transfer.model.WebResponse;
import com.cardinal.project.human_isekai_transfer.service.PlayerService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping(
            path = "/api/player", 
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
                    )
                    public WebResponse<String> regisPlayer(@RequestBody RegisterPlayerRequest request) {
        playerService.register(request);
        return WebResponse.<String>builder().data("OK").build();
    }
}
