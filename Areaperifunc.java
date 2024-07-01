import java.util.Scanner;
public class Areaperifunc{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius= read.nextDouble();
        double a=area(radius);
        double peri=perimeter(radius);
        System.out.print("The area is "+a+" and perimeter is "+peri);
    }
    public static double area(double r){
        return 2*3.14*r;
    }
    public static double perimeter(double r){
        return 3.14*r*r;
    }
}