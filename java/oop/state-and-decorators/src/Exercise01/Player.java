package Exercise01;

public class Player {
	private String name;
	public Player (String name) { 
		this.name = name;
		GameStatistics.playerCount++;
	}
	// Den für diesen Charakter vorgesehenen Angriff ausführen.
	public int attack (int damage) {
		return GameStatistics.totalDamage = GameStatistics.totalDamage + damage ;
	}
}
