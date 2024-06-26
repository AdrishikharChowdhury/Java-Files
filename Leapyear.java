import java.util.Scanner;
public class Leapyear{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter a year o find if it's leap year or not: ");
        int year=read.nextInt();
        if(year%100==0)
        {
            if(year%400==0)
                System.out.print(year+ " is a leap year");
            else
                System.out.print(year+ " is not a leap year");
        }
        else {
            if(year%4==0)
                System.out.print(year+ " is a leap year");
            else
                System.out.print(year+ " is not a leap year");
        }
    }
}