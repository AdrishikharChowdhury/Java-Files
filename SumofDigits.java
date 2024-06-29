import java.util.Scanner;
public class SumofDigits{
    public static void main(String[] args){
        int p=0,r;
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the no. ");
        int num= read.nextInt();
        while(num!=0)
        {
            r=num%10;
            p=p+r;
            num=num/10;
        }
        System.out.print("The sum of the digits is "+p);
    }
}