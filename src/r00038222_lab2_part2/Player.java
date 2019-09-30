package r00038222_lab2_part2;

public class Player {
	String name;
	String code;
	
	public void player(String name) {
		setName(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String getCode() {
		Code playerCode =new Code(name);
		this.code=playerCode.initials();
		return this.code;
		
	}
	public String toString() {
		return " ";
	}
	public Player(String name) {
		this.name = name;
		this.code = getCode();
	}
	public String forArray() {
		String fullPlayer = name+" "+code;
		return fullPlayer;
	}
	public void print(){
		
	}
}
