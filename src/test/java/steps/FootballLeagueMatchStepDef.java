package steps;

import com.sapient.model.FootballLeagueMacthModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

public class FootballLeagueMatchStepDef {

    UriComponentsBuilder builder;
    HttpEntity<String> entity;
    HttpHeaders headers;
    ResponseEntity<FootballLeagueMacthModel> responseEntity;


}
