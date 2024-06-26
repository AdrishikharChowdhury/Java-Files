import java.util.Scanner;
public class ANDORgate{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the value 0 or 1: ");
        int a=read.nextInt();
        System.out.print("Enter the value 0 or 1: ");
        int b=read.nextInt();
        int o1=a+b;
        int o2=a*b;
        System.out.println("The AND gate output is "+o2);
        if(o1>=1)
            System.out.println("The OR gate output is 1");
        else
            System.out.println("The OR gate output is 0");
    }
}