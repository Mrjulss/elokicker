package com.kickscore.kickscore.match;

import com.kickscore.kickscore.league.League;
import com.kickscore.kickscore.league_player.LeaguePlayer;
import com.kickscore.kickscore.utils.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Set;

@Entity
@Table(name = "matches")
public class Match extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private GameType gameType;

    @NotNull
    @PositiveOrZero
    private int team1_score;

    @NotNull
    @PositiveOrZero
    private int team2_score;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "league_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private League league;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "match_leagueplayer1",
            joinColumns = @JoinColumn(name = "match_id"), // Reference to Match primary key
            inverseJoinColumns = {
                    @JoinColumn(name = "league_id", referencedColumnName = "league_id"),
                    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
            }
    )
    private Set<LeaguePlayer> team1;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "match_leagueplayer2",
            joinColumns = @JoinColumn(name = "match_id"), // Reference to Match primary key
            inverseJoinColumns = {
                    @JoinColumn(name = "league_id", referencedColumnName = "league_id"),
                    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
            }
    )
    private Set<LeaguePlayer> team2;
}
