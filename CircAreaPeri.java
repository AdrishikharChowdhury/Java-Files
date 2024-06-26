import java.util.Scanner;
public class CircAreaPeri {
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        double r=read.nextInt();
        double area=3.14*r*r;
        double peri=2*3.14*r;
        System.out.println("The area and perimeter of the circle is "+area+" " +peri+" respectively");
    }
}