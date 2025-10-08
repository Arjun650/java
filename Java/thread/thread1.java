
class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try{
                Thread.sleep(10); 
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.setPriority(Thread.MAX_PRIORITY);
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
