import java.util.Scanner;
public class swapval{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a=read.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=read.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.print("The swapped variables are: "+a+" "+b);
    }
}