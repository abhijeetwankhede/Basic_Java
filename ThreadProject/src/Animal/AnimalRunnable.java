package Animal;

public class AnimalRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<4;i++)
		{
			
			System.out.println("Run by	"	+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("state of thread "+Thread.currentThread().getName());
		
		System.out.println("exit thread is  "+Thread.currentThread().getName());
		
	}

}
