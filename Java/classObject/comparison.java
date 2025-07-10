public class comparison {

    public static void main(String[] args){
        test t1 = new test(); 
        test t2 = new test(); 

        test t3 = t2; 

        t2.a = 20; 


        System.out.println(t3 == t2); 
        System.out.println(t3.a); 
        System.out.println(t2.a); 
        System.out.println(t2.b); 
        
        test t4 = new test(20, 80); 
        System.out.println(t4.a); 
        System.out.println(t4.b); 
        
    }
}

class test{
        public test(){
        System.out.println("TEst 1"); 
    }

    public test(int a , int b){
        this.a = a; 
        this.b = b; 
    }
    int a = 4 ; 
    int b  = 5; 


}