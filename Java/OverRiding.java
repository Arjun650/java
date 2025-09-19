class parent{
    static int show(){
        System.out.println("Inside parent show");
        return 1; 
    }
}

class child extends parent{
    static int show2(){
        System.out.println("Inside child show");
        return 2; 
    }
}

public class OverRiding {
    public static void main(String[] args) {
        parent c = new child(); 

        System.out.println(c.show2());
    }
}
