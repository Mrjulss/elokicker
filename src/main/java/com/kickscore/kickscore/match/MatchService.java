package com.kickscore.kickscore.match;

import com.kickscore.kickscore.league.League;
import com.kickscore.kickscore.match.dtos.MatchInsertRequest;
import com.kickscore.kickscore.player.Player;
import com.kickscore.kickscore.player.PlayerRepository;
import com.kickscore.kickscore.team.Team;
import com.kickscore.kickscore.team.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class MatchService {
    private final MatchRepository matchRepository;
    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;

    public MatchService(MatchRepository matchRepository, TeamRepository teamRepository, PlayerRepository playerRepository) {
        this.matchRepository = matchRepository;
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
    }

    public void createMatch(MatchInsertRequest matchInsertRequest) {

    }
}
