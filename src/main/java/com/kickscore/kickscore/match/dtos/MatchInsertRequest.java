package com.kickscore.kickscore.match.dtos;

import com.kickscore.kickscore.match.GameType;

import java.util.List;

public record MatchInsertRequest(
        List<Long> team1LeaguePlayersIds,
        List<Long> team2LeaguePlayersIds,
        GameType gameType,
        int team1Score,
        int team2Score
) {
}
