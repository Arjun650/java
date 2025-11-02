import java.io.IOException;

public class UsingSystemIn {
    public static void main(String[] args) throws IOException {
        int num; 
        num = System.in.read(); 

        System.out.println((char)num);
    }
}
