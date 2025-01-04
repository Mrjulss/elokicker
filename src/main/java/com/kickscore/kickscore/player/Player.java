package com.kickscore.kickscore.player;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kickscore.kickscore.invitation.Invitation;
import com.kickscore.kickscore.league_player.LeaguePlayer;
import com.kickscore.kickscore.user.model.MyUser;
import com.kickscore.kickscore.utils.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "players")
public class Player extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private MyUser user;

    @JsonIgnore
    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<LeaguePlayer> leaguePlayers;

    @JsonIgnore
    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Invitation> invitations;
}
