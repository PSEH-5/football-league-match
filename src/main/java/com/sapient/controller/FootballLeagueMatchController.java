package com.sapient.controller;


import com.sapient.model.FootballLeagueMacthModel;
import com.sapient.service.FootballLeagueMatchService;
import com.sapient.utils.FootballLeagueException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@RestController
public class FootballLeagueMatchController {
    @Inject
    FootballLeagueMatchService footballLeagueMatchService;

    @GetMapping()
    List<FootballLeagueMacthModel> getLeagueDetails(@RequestParam Integer countryId, @RequestParam Integer matchId, @RequestParam Optional<Integer> position) throws FootballLeagueException {
        return footballLeagueMatchService.getLeagueDetails(countryId,matchId,position);
    }
}
