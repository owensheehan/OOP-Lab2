package r00038222_lab2_part1;

public class TestBicycle
{
    public static void main()
    {
        Bicycle  bike1 = new Bicycle(); //Creates a new object called bike1.
        bike1.setSpeed(100); //passes the value 100 into the setSpeed method of the bike1 object.
        bike1.setMaker("Raleigh");//passes the String "Raleigh" into the setMaker method of the bike1 object.
        bike1.setType("Mountain Bike");//was missing semi colon, passes the String "Mountain Bike" into the setType method of the bike1 object.
        bike1.print();// calls the print method of the bike1 object.
        
        Bicycle bike2 = new Bicycle(10,"Home Made", "Bone Shaker");//Creates a new object called bike2 and passes 10 and "Home Made" and "Bone Shaker" into it
        bike2.print();//bike2 object name not given, calls the print method of the bike2 object. 
    }
  
}
