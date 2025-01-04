package com.kickscore.kickscore.league_player;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class LeaguePlayerKey {
    private Long leagueId;
    private Long playerId;

    public LeaguePlayerKey() {
    }

    public LeaguePlayerKey(Long leagueId, Long playerId) {
        this.leagueId = leagueId;
        this.playerId = playerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeaguePlayerKey that = (LeaguePlayerKey) o;

        if (leagueId != null ? !leagueId.equals(that.leagueId) : that.leagueId != null) return false;
        return playerId != null ? playerId.equals(that.playerId) : that.playerId == null;
    }

    @Override
    public int hashCode() {
        int result = leagueId != null ? leagueId.hashCode() : 0;
        result = 31 * result + (playerId != null ? playerId.hashCode() : 0);
        return result;
    }
}
