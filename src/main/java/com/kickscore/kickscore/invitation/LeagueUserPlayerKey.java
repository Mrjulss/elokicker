package com.kickscore.kickscore.invitation;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class LeagueUserPlayerKey {
    private Long leagueId;
    private Long userId;
    private Long playerId;

    public LeagueUserPlayerKey() {
    }

    public LeagueUserPlayerKey(Long leagueId, Long userId, Long playerId) {
        this.leagueId = leagueId;
        this.userId = userId;
        this.playerId = playerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeagueUserPlayerKey that = (LeagueUserPlayerKey) o;

        if (leagueId != null ? !leagueId.equals(that.leagueId) : that.leagueId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        return playerId != null ? playerId.equals(that.playerId) : that.playerId == null;
    }

    @Override
    public int hashCode() {
        int result = leagueId != null ? leagueId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (playerId != null ? playerId.hashCode() : 0);
        return result;
    }
}
