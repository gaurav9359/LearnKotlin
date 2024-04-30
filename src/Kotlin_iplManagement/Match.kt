package Kotlin_iplManagement

class Match(
    private val team1: Team,
    private val team2: Team,
    private val winner: Team,
    tournament: CricketTournament
) {
    private val playerDismissals: MutableMap<Player, DismissalType> = mutableMapOf()
    private val teamScores: MutableMap<Team, Int> = mutableMapOf()

    init {
        tournament.updateLeaderboard(winner)
    }

    fun recordDismissal(player: Player, runs: Int, wickets: Int, dismissalType: DismissalType) {
        playerDismissals[player] = dismissalType
        player.scoredRuns(runs)
        player.playedMatch()
        player.tookWickets(wickets)
    }

    fun recordTeamScore(team: Team, score: Int) {
        teamScores[team] = score
    }
}