package FirstDay;

public class Animal {

	String eat;
	int noOfLegs;
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String eat,int noOfLegs)
	{
		this.eat=eat;
		this.noOfLegs=noOfLegs;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	public void showAnimalDetails()
	{
		System.out.println(getEat()+" "+getNoOfLegs());
	}
}
