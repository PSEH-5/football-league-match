package com.sapient.utils;

public class FootballLeagueException extends Exception {

    public FootballLeagueException(String msg) {
        System.out.println("Country or Match Not Exist");
    }
}
