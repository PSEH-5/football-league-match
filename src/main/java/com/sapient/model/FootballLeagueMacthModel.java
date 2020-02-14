package com.sapient.model;


import lombok.Data;

@Data
public class FootballLeagueMacthModel {

    private Integer countryId;
    private String countryName;
    private Integer teamId;
    private String teamName;
    private Integer position;
}
