package com.kickscore.kickscore.league;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kickscore.kickscore.invitation.Invitation;
import com.kickscore.kickscore.league_player.LeaguePlayer;
import com.kickscore.kickscore.match.Match;
import com.kickscore.kickscore.utils.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
@Table(name = "leagues")
public class League extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Match> matches;

    @JsonIgnore
    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<LeaguePlayer> leaguePlayers;

    @JsonIgnore
    @OneToMany(mappedBy = "league", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Invitation> invitations;
}
