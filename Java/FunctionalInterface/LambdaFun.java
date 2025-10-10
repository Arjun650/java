@FunctionalInterface
interface InnerLambdaFun {
    void sayHello(); 
    
} 


public class LambdaFun {
    public static void main(String[] args) {
        InnerLambdaFun en = new InnerLambdaFun() {
            public void sayHello(){
                System.out.println("Hello world"); 
            }
        };

        InnerLambdaFun en1 = () ->{
            System.out.println("Hello from labmda");
        }; 


        en.sayHello();
        en1.sayHello();
    }
}
