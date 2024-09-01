package concurrentcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Threadsafe {

	public static void main(String[] args) {

//		concurrent are thread safe

		List<String> list = new CopyOnWriteArrayList<>();
		list.add("first ");
		list.add("second");
		list.add("third ");
		list.add("fourth ");
		list.add("fifth ");

		Runnable r = () -> {
			try {
				for (String l : list) {
					System.out.println(l);
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		};

		Runnable r2 = () -> {
			list.add("new Value1");
			list.add("new Value2");
		};

		new Thread(r2).start();
		new Thread(r).start();

	}
}
