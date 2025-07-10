interface College {
    int a = 10;  // implicitly public static final

    void print();  // implicitly public and abstract

    default void print1() {
        System.err.println("test");  // using System.err for red output
    }

    static void show() {
        System.out.println("inside show");
    }
}

class B implements College {
    public void print() {
        System.out.println("Printing print");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        College obj = new B();
        obj.print();      // prints: Printing print
        obj.print1();     // prints: test (from default method)

        College.show();   // prints: inside show (static method)
    }
}
