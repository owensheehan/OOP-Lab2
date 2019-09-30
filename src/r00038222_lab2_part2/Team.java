package r00038222_lab2_part2;

import java.util.ArrayList;

public class Team {
	private String name;
	private String jersey;
	private String location;
	ArrayList<String> players = new ArrayList<String>();
	
	public Team(String name, String jersey, String location) {
		this.name = name;
		this.jersey = jersey;
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getJersey(String jersey) {
		this.jersey = jersey;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setPlayers(ArrayList<String> players) {
		this.players = players;
	}
	public String getName() {
		return this.name;
	}
	public String getJersey() {
		return this.jersey;
	}
	public String getLocation() {
		return this.location;
	}
	public ArrayList<String> getPlayers(String fullPlayer){
		players.add(fullPlayer);
		return this.players;
	}
	public String toString() {
		return "Team Name: "+name+" Jersey: "+jersey+" From: "+location;
	}
	public void print() {
		System.out.println(toString());
		for (String a: players) {
			System.out.println(a);
		}
	}
	
}
