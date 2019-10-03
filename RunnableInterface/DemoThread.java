package RunnableInterface;

public class DemoThread implements Runnable{

	  public DemoThread() {
		  
		  
		  
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
		
	}
	
	public static void main(String[] args) {
		
		DemoThread demo=new DemoThread();
		
		

	}

	
}
