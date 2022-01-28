package com.stephens.BreweryAPI.model;

import java.util.ArrayList;
import java.util.List;

public class Breweries {
    private List<Brewery> breweryList;

    public List<Brewery> getBreweryList(){
        if(breweryList == null){
            breweryList = new ArrayList<>();
        }
        return breweryList;
    }

    public void setBreweryList(List<Brewery> breweryList) {
        this.breweryList = breweryList;
    }
}
