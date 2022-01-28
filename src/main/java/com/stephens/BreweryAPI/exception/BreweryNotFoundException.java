package com.stephens.BreweryAPI.exception;

public class BreweryNotFoundException extends NullPointerException {
    public BreweryNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
