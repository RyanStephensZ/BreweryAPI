package com.stephens.BreweryAPI.controller;

import com.stephens.BreweryAPI.model.Brewery;
import com.stephens.BreweryAPI.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Service service;

    @GetMapping(path = "/", produces = "application/json")
    public List<Brewery> findAllBrews() {
        return service.getAllBrews();
    }

    @GetMapping("/{name}")
    public List<Brewery> findUserById(@PathVariable(value = "name") String name) {
        return service.getUserById(name);
    }

}
