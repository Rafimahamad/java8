package threads;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Runnable th1=()->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}; 
		
		Thread t=new Thread(th1);
		//t.setName("Rafi");
		t.start();
		
		Runnable th2 = () -> {
			try {
				
				for(int i=0;i<10;i++) {
					System.out.println(i);
					Thread.sleep(1000);
				}
				
			} catch (Exception e2) {
			e2.printStackTrace();
			}
		};
		Thread t2=new Thread(th2);
		//t2.setName("Rafi");
		t2.start();
		
	}

}
