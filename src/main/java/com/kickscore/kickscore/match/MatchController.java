package com.kickscore.kickscore.match;

import com.kickscore.kickscore.match.dtos.MatchInsertRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/matches")
public class MatchController {
    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping
    public ResponseEntity<Void> createMatch(@RequestBody MatchInsertRequest matchInsertRequest) {
        matchService.createMatch(matchInsertRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
