package com.stephens.BreweryAPI.Controller;

import com.stephens.BreweryAPI.model.Brewery;
import com.stephens.BreweryAPI.service.Service;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ControllerTest {

    @Autowired
    private Service service;

    @Test
    void getAllRecordsTest() {
        List<Brewery> breweryList = service.getAllBrews();
        Assertions.assertThat(breweryList.size()).isGreaterThan(0);
    }

    @Test
    void getByNameTest() {
        List<Brewery> breweryList = service.getUserById("madtree");
        Assertions.assertThat(breweryList.size()).isGreaterThan(0);
    }
}