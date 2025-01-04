package com.kickscore.kickscore.match;

import com.kickscore.kickscore.match.dtos.MatchInsertRequest;
import com.kickscore.kickscore.player.PlayerRepository;
import org.springframework.stereotype.Service;


@Service
public class MatchService {
    private final MatchRepository matchRepository;
    private final PlayerRepository playerRepository;

    public MatchService(MatchRepository matchRepository, PlayerRepository playerRepository) {
        this.matchRepository = matchRepository;
        this.playerRepository = playerRepository;
    }

    public void createMatch(MatchInsertRequest matchInsertRequest) {

    }
}
