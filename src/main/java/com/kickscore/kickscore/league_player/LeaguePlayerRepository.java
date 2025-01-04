package com.kickscore.kickscore.league_player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaguePlayerRepository extends JpaRepository<LeaguePlayer, LeaguePlayerId> {
}
