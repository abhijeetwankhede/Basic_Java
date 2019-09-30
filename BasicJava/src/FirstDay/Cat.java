package FirstDay;

public class Cat extends Animal{

	String color;
	
	public Cat(String eat,int noOfLegs,String color) {
	
		this.eat=eat;
		this.noOfLegs=noOfLegs;
		this.color=color;
	}
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void showAnimalDetails()
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println(eat+" :EATING\t" +noOfLegs+" :LEGS \t"+color+" :COLOR");
		System.out.println("-------------------------------------------------------------");
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
}
