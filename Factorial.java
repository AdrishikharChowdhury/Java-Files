import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial: ");
        int num= read.nextInt();
        int fact=1,i=1;
        if(num==0)
            System.out.print("The factorial of "+num+" is "+fact);
        else {
            while(i<=num)
            {
                fact=fact*i;
                i++;
            }
            System.out.print("The factorial of "+num+" is "+fact);
        }
    }
}