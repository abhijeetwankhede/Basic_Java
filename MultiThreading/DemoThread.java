package MultiThreading;



public class DemoThread extends Thread{
	
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"thread "+getName());
		}
	}
	

	public static void main(String[] args) {
		
		DemoThread demo1 =new DemoThread();
		DemoThread demo2 =new DemoThread();
		
		demo1.setName("abhijeet");
		demo1.start();
		
		demo2.setName("Uday");
		demo2.run();
	}

}
