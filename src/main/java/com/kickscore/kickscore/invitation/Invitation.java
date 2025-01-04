package com.kickscore.kickscore.invitation;

import com.kickscore.kickscore.league.League;
import com.kickscore.kickscore.player.Player;
import com.kickscore.kickscore.user.model.MyUser;
import com.kickscore.kickscore.utils.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Invitation extends BaseEntity {
    @EmbeddedId
    private LeagueUserPlayerKey id;

    @ManyToOne
    @MapsId("leagueId")
    @JoinColumn(name = "league_id")
    private League league;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private MyUser user;

    @ManyToOne
    @MapsId("playerId")
    @JoinColumn(name = "player_id")
    private Player player;

    private InvitationStatus status;
}
