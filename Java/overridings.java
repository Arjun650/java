class A{
    public void thisIsASampleFunctionThatPrintsSampleResults(){
        System.out.println("Inside A class");
    }
}

class B extends A{
    @Override
    public void thisIsASampleFunctionThatPrintsSampleResults(){
        System.out.println("Inside B class");
    }
}

public class overridings {
    public static void main(String[] args) {
        A test = new B(); 

        System.out.println("skd" - 3);
        test.thisIsASampleFunctionThatPrintsSampleResults(); 
    }
}
