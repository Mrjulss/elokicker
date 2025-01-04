package com.kickscore.kickscore.league_player;

import com.kickscore.kickscore.league.League;
import com.kickscore.kickscore.player.Player;
import com.kickscore.kickscore.team.Team;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class LeaguePlayer {
    @EmbeddedId
    private LeaguePlayerKey id;

    @ManyToOne
    @MapsId("leagueId")
    @JoinColumn(name = "league_id")
    private League league;

    @ManyToOne
    @MapsId("playerId")
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Team> teams;

    private int elo;
}
