package com.kickscore.kickscore.league_player;

import com.kickscore.kickscore.league.League;
import com.kickscore.kickscore.match.Match;
import com.kickscore.kickscore.player.Player;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class LeaguePlayer {
    @EmbeddedId
    private LeaguePlayerId id;

    @ManyToOne
    @MapsId("leagueId")
    @JoinColumn(name = "league_id")
    private League league;

    @ManyToOne
    @MapsId("playerId")
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToMany(mappedBy = "team1", fetch = FetchType.LAZY)
    private Set<Match> matches_as_team1 ;

    @ManyToMany(mappedBy = "team2", fetch = FetchType.LAZY)
    private Set<Match> matches_as_team2;

    private int elo;
}
