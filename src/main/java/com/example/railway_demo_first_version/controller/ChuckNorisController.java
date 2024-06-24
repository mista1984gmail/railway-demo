package com.example.railway_demo_first_version.controller;

import com.example.railway_demo_first_version.service.ChuckNorisService;
import com.example.railway_demo_first_version.service.dto.JokeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jokes")
public class ChuckNorisController {

    private ChuckNorisService chuckNorisServiceImpl;

    @Autowired
    public ChuckNorisController(ChuckNorisService chuckNorisServiceImpl) {
        this.chuckNorisServiceImpl = chuckNorisServiceImpl;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public JokeDto ChuckNorisSaid(){
        return chuckNorisServiceImpl.getJoke();
    }

}
