package Kotlin_iplManagement

class Player(
    val name: String,
    val age: Int,
    val role: String
) {
    private var matchesPlayed: Int = 0
    private var runsScored: Int = 0
    private var wicketsTaken: Int = 0
    private var fiftiesScored: Int = 0
    private var centuriesScored: Int = 0

    fun scoredRuns(runs: Int) {
        runsScored += runs
        if (runs >= 50 && runs < 100) {
            fiftiesScored++
        } else if (runs >= 100) {
            centuriesScored++
        }
    }

    fun tookWickets(wickets: Int) {
        wicketsTaken += wickets
    }

    fun playedMatch() {
        matchesPlayed++
    }

    fun getRuns(): Int {
        return runsScored
    }

    fun getWicket(): Int {
        return wicketsTaken
    }

    fun get50s(): Int {
        return fiftiesScored
    }
}