package com.sapient.service;

import com.sapient.model.FootballLeagueMacthModel;
import com.sapient.repository.FootballLeagueMatchRepository;
import com.sapient.utils.FootballLeagueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class FootballLeagueMatchService {
    public List<FootballLeagueMacthModel> getLeagueDetails(Integer countryId, Integer matchId, Optional<Integer> position)

    throws FootballLeagueException {


        FootballLeagueMatchRepository footballLeagueMatchRepository;

        if(countryId == null || matchId == null){
            throw new FootballLeagueException("Country or Match doesnot exist");
        }
        if(position.isPresent()){

        }

        return null;
    }
}
