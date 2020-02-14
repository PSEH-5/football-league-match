package com.sapient.repository;

import com.sapient.model.FootballLeagueMacthModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootballLeagueMatchRepository {

    List<Integer> findByCountryId(Integer countryId);
    List<FootballLeagueMacthModel> findAll();
}
