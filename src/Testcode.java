
class Testcode implements Runnable {

int a = 0, b = 0;

int incrementA() {

return ++a;

}

int incrementB() {

return ++b;

}

@Override
public void run() {

for (int i = 0; i < 3; i++)

System.out.println(incrementA()+"" + incrementB());
}
public static void main(String args[]) {

Testcode test1= new Testcode();

Testcode test2 = new Testcode();

Thread t1= new Thread(test1);

Thread t2= new Thread(test2);

t2.start();

t1.start();
}


}
