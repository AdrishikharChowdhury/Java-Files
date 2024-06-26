//Without &&,||
import java.util.Scanner;
public class Avgof3subfirst{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the numbers of 3 subjects");
        int sub1= read.nextInt();
        int sub2= read.nextInt();
        int sub3= read.nextInt();
        int avg=(sub1+sub2+sub3)/3;
        if(avg>=60)
            System.out.print("You got 1st division");
        else {
            if(avg>=50)
                System.out.print("You got 2nd division");
            else {
                if(avg>=40)
                    System.out.print("You got 3rd division");
                else
                    System.out.print("You failed");
            }
        }
    }
}