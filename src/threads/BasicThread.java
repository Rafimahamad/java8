package threads;

public class BasicThread {

	
	public static void main(String[] args) {
		Thread1 t1=new Thread1();

		Thread thread=new Thread(t1);
		thread.start();
		
		Thread2 t2=new Thread2();
		t2.start();
	}
}

//creating a thread by implimenting Runnable Interface

class Thread1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}	
	
}

//creating a thread by extending thread class

class Thread2 extends Thread{
	
//	public static void main(String[] args) {
//		System.out.println("thread2");
//	}
	
	public void run() {
		for(int i=10;i<15;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}	
}