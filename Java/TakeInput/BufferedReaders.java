import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaders {
    public static void main(String[] args) throws IOException{
        InputStreamReader in  =new InputStreamReader(System.in); 


        BufferedReader bf = new BufferedReader(in);  
        
        int data = Integer.parseInt(bf.readLine()); 

        System.out.println(data);


        bf.close();
    }
}
