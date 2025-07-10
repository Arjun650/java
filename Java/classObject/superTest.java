public class superTest {
    public static void main(String[] args){
        b b2 = new b(); 
        b2.printParentA(); // prints parent's 'a'
    }
}

class a {
    int a = 10; 
}

class b extends a {
    int a = 20;

    void printParentA() {
        System.out.println("Parent's a using super: " + super.a); // ✅
        System.out.println("Child's a using this: " + this.a);
    }
}
