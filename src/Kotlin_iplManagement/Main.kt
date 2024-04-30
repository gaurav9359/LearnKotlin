package Kotlin_iplManagement

fun main() {
    val player1 = Player("Virat Kohli", 32, "Batsman")
    val player2 = Player("Jasprit Bumrah", 28, "Bowler")
    val player3 = Player("MS Dhoni", 39, "Wicketkeeper")


    val team1 = Team("Team1", "Stadium1")
    team1.addPlayer(player1)
    team1.addPlayer(player2)

    val team2 = Team("Team2", "Stadium2")
    team2.addPlayer(player3)

    val tournament = CricketTournament(TournamentType.IPL, MatchFormat.T20)

    tournament.addTeam(team1)
    tournament.addTeam(team2)

    val match = Match(team1, team2, team1, tournament)

    match.recordDismissal(player1, 50, 0, DismissalType.CAUGHT)
    match.recordDismissal(player2, 0, 2, DismissalType.BOWLED)

        val highestWicketTaker = tournament.getHighestWicketTaker()
        println("Highest Wicket Taker: ${highestWicketTaker?.name}")


        val playerWithMost50s = tournament.getPlayerWithMost50s()
        println("Player with Most 50s: ${playerWithMost50s?.name}")


        tournament.printSemifinalistTeams()


        tournament.printTopRunScorers(5)


        tournament.printWinner()


}