package com.kickscore.kickscore.team;

import com.kickscore.kickscore.league_player.LeaguePlayer;
import com.kickscore.kickscore.match.Match;
import com.kickscore.kickscore.player.Player;
import com.kickscore.kickscore.utils.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "teams")
public class Team extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "team1", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Match> matches_as_team1;

    @OneToMany(mappedBy = "team2", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Match> matches_as_team2;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "team_leagueplayers",
        joinColumns = @JoinColumn(name = "team_id"),
        inverseJoinColumns = @JoinColumn(name = "leagueplayer_id")
    )
    private Set<LeaguePlayer> leaguePlayers;
}
