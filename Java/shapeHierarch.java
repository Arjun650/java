import java.util.Scanner;
public class shapeHierarch {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter your name"); 

    shape a = new circle(7); 
    System.out.println("area of circle: " +  a.area()); 
    System.out.println("perimeter of circle: " +  a.perimeter()); 
    }
    
}
abstract class shape{
    shape(){
        System.out.println("This is from shape class");
    }
    abstract double area(); 
    abstract double perimeter(); 

    public void print(){
        System.out.println("This is the shape class"); 
    }
}

class circle extends shape{
    private int radius; 

    circle(int radius){
        this.radius = radius; 
    }

    @Override
    public double area(){
        return radius * radius * 3.14; 
    }
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
