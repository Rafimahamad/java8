package reference;

public class refDemo {
public static void main(String[] args) {
	
//	 static method reference
	Worker w=Work::doWork;
	w.doWork();
	Runnable r=Work::threadTask;
	Thread th=new Thread(r);
	th.start();
	
	
//	non-static method reference
	Work w2=new Work();
	Runnable r2 = w2::printNumbers;
	Thread th2=new Thread(r2);
	th2.start();
	
	
//	 constructor reference
	
	Provider p=Student::new;
	Student student = p.getStudent();
	
}
}
