package reference;

public class Work {

	static void doWork() {
		System.out.println("method is working ! ");
	}
	
	public static void threadTask() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void printNumbers() {
		try {
			for(int i=5;i<10;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
