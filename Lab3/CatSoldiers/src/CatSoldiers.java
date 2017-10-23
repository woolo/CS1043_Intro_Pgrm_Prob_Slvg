
public class CatSoldiers 
{

	public static void main(String[] args) 
	{
		//main method is intended to leave blank for Lab class
	
			Cat soldierNoOne = new Cat ("Mewbaco", 4, 30.0);
			soldierNoOne.setName("KUKUDA");
			System.out.println(soldierNoOne.toString());
	}
}
	
class Cat
{
		private String name;
		private int age;
		private double topSpeed;
		
		//Constructor
		public Cat(String nam, int ag, double Tspeed)
		{
			name = nam;
			age = ag;
			topSpeed = Tspeed;
		}
		
		//Get methods
		public String getName()
		{
			return name;
		}
		
		public int getAge()
		{
			return age;
		}
		
		public double getTopSpeed()
		{
			return topSpeed;
		}
		
		//Mutator or Set value methods
		public void setName(String nam)
		{
			name = nam;
		}
		
		public void setAge(int ag)
		{
			age = ag;
		}
		
		public void setTopSpeed(double Tspeed)
		{
			topSpeed = Tspeed;
		}

		@Override
		public String toString()
		{
			return "This cat is "+name+".\n"+
					"It is "+ age +" years old.\n"+
					"It can run up to "+ topSpeed +" kilometers per hour!";
		}
}
