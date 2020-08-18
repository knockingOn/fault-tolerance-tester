package com.brownstone.ftt.controller;

import com.brownstone.ftt.entity.Server;
import com.brownstone.ftt.repository.ServerRepository;
import com.brownstone.ftt.service.DisruptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/disrupt")
public class Controller {
    @Autowired
    ServerRepository serverRepository;

    @Autowired
    DisruptionService disruptionService;

    @PostMapping("/addServer")
    public @ResponseBody
    Mono<Server> addServer(@RequestBody Server server) {
        return serverRepository.save(server);
    }

    @GetMapping("/getAllServers")
    public @ResponseBody
    Flux<Server> getAllServers() {
        return serverRepository.findAll();
    }

}
