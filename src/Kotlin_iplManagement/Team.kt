package Kotlin_iplManagement

class Team(
    val name: String,
    val homeGround: String
) {
    private val players: MutableList<Player> = mutableListOf()
    var points: Int = 0
    var rank: Int = 0

    fun addPlayer(player: Player) {
        players.add(player)
    }

    fun getPlayers(): List<Player> {
        return players
    }
}