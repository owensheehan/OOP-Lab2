package r00038222_lab2_part1;

public class Bicycle {

	public static void main(String[] args) {
		

	}
	int speed;
	String maker;
	String type;
	
	public Bicycle(int speed, String maker, String type ) {
		setSpeed(speed);
		setMaker(maker);
		setType(type);
	}
	public Bicycle() {
		
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void print() {
		System.out.println(this);
	}
	
	public String toString() {
		return "Bicycle Speed: "+speed+" Bicycle Make: "+maker+" Bicycle type: "+type;
	}

	

}
