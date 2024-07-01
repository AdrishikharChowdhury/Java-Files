import java.util.Scanner;
public class Sumfunc{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double a= read.nextDouble();
        double b= read.nextDouble();
        double c=sum(a,b);
        System.out.print("The sum of "+a+" and "+b+" is "+c);
    }
    public static double sum(double a,double b){
        return a+b;
    }
}