package com.kickscore.kickscore.match;

import com.kickscore.kickscore.league.League;
import com.kickscore.kickscore.team.Team;
import com.kickscore.kickscore.utils.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team1_id", nullable = false)
    private Team team1;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team2_id", nullable = false)
    private Team team2;
}
