class Parent {
    void show() { System.out.println("Parent show"); }
    void play() { System.out.println("Child play"); }  // only in child
}

class Child extends Parent {
    void show() { System.out.println("Child show"); }  // overridden
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();

        p.show();  // ✅ Calls Child's overridden show() at runtime
        // p.play();  //  Compile-time error: Parent reference has no method play()
    }
}
