package r00038222_lab2_part2;

public class Code {
	private String name;
	public Code(String name) {
		this.name = name;
	}
	public String initials() {
		String fullName = getName();
		String[] splitName = fullName.split(" ");
		char fName = splitName[0].charAt(0);
		char lName = splitName[1].charAt(0);
		StringBuilder in = new StringBuilder();
		in.append(fName);
		in.append(lName);
		String code = in.toString();
		return code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
