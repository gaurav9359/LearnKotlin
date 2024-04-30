package Kotlin_iplManagement

class CricketTournament(
    private val tournamentType: TournamentType,
    private val matchFormat: MatchFormat
) {
    private val teams: MutableList<Team> = mutableListOf()
    private val leaderboard: MutableMap<Team, Int> = mutableMapOf()
    private val maxTeams: Int = if (tournamentType == TournamentType.IPL) 10 else 8
    private val maxPlayersPerTeam: Int = if (tournamentType == TournamentType.IPL) 12 else 11
    private val semifinalistTeams: MutableList<Team> = mutableListOf()
    private var winner: Team? = null

    fun addTeam(team: Team) {
        if (teams.size < maxTeams) {
            if (team.getPlayers().size <= maxPlayersPerTeam) {
                teams.add(team)
                leaderboard[team] = 0
            } else {
                println("Maximum players limit exceeded for team ${team.name}. Cannot add the team.")
            }
        } else {
            println("Maximum teams limit reached. Cannot add more teams.")
        }
    }

    fun setSemifinalistTeams(teams: List<Team>) {
        semifinalistTeams.addAll(teams)
    }

    fun updateLeaderboard(winner: Team) {
        val currentScore = leaderboard[winner]
        if (currentScore != null) {
            leaderboard[winner] = currentScore + 2
        } else {
            println("Team not found in leaderboard.")
        }
    }

    fun setWinner(winner: Team) {
        this.winner = winner
    }

    fun getSemifinalistTeams(): List<Team> {
        return semifinalistTeams
    }

    fun getWinner(): Team? {
        return winner
    }

    fun getHighestWicketTaker(): Player? {
        var highestWicketTaker: Player? = null
        var maxWickets = 0

        for (team in teams) {
            for (player in team.getPlayers()) {
                val wickets = player.getWicket()
                if (wickets > maxWickets) {
                    maxWickets = wickets
                    highestWicketTaker = player
                }
            }
        }

        return highestWicketTaker
    }

    fun getPlayerWithMost50s(): Player? {
        var playerWithMost50s: Player? = null
        var maxFifties = 0

        for (team in teams) {
            for (player in team.getPlayers()) {
                val numFifties = player.get50s()
                if (numFifties > maxFifties) {
                    maxFifties = numFifties
                    playerWithMost50s = player
                }
            }
        }

        return playerWithMost50s
    }

    fun printSemifinalistTeams() {
        val sortedEntries = leaderboard.toList().sortedByDescending { (_, value) -> value }

        println("Semifinalists:")
        var count = 0
        for ((team, _) in sortedEntries) {
            if (count >= 4) {
                break // Stop after printing the top 4 teams
            }
            println("${team.name} - ${leaderboard[team]} points")
            count++
        }
    }

    fun printTopRunScorers(count: Int) {
        val allPlayers = teams.flatMap { it.getPlayers() }.sortedByDescending { it.getRuns() }

        println("Top $count Run Scorers:")
        for ((index, player) in allPlayers.withIndex().take(count)) {
            println("${index + 1}. ${player.name} - ${player.getRuns()} runs")
        }
    }

    fun printWinner() {
        val sortedEntries = leaderboard.toList().sortedByDescending { (_, value) -> value }
        val (winnerTeam, winnerPoints) = sortedEntries.first()
        println("Winner Team name: ${winnerTeam.name} points: $winnerPoints")
    }

    fun getLeaderboard(): Map<Team, Int> {
        return leaderboard
    }
}