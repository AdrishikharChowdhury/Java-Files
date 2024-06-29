import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the number to check if its Armstrong or not: ");
        int num= read.nextInt();
        int n=num,sum=0,r;
        while(n!=0)
        {
            r=n%10;
            sum=sum+(int)Math.pow(r,3);
            n=n/10;
        }
        if(sum==num)
            System.out.print(num+" is an Armstrong number");
        else
            System.out.print(num+" is not an Armstrong number");
    }
}