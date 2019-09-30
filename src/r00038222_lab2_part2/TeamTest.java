package r00038222_lab2_part2;

import java.util.ArrayList;

public class TeamTest {
	ArrayList<String> teamPlayers = new ArrayList<String>();
	Team mvbi = new Team("MyVeryBestIrish", "red", "Cork");
	Team mvbw = new Team ("MyVeryBestWorld","Blue","Dublin");
	
	public void teamRed() {
		teamPlayers.add("Pakie Bonner");
		teamPlayers.add("Seamus Coleman");
		teamPlayers.add("Robbie Keane");
		teamPlayers.add("Liam Miller");
		for (int i = 0; i < teamPlayers.size(); i++) {
			String fullPlayer = build(i);
			mvbi.getPlayers(fullPlayer);
		}
		mvbi.print();
	}
	public void teamBlue() {
		teamPlayers.clear();
		teamPlayers.add("Lionel Messi");
		teamPlayers.add("Cristiano Ronaldo");
		teamPlayers.add("Diego Maradonna");
		for (int i = 0; i < teamPlayers.size(); i++) {
			String fullPlayer = build(i);
			mvbw.getPlayers(fullPlayer);
		}
		mvbw.print();
	}
	public String build(int i) {
		String name = teamPlayers.get(i);
		Player names = new Player(name);
		names.getCode();
		String fullPlayer = names.forArray();
		return fullPlayer;
	}
}
