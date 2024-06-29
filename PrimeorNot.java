import java.util.Scanner;
public class PrimeorNot{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter a number to find if it's prime or not: ");
        int num=read.nextInt();
        int i=2,p=0;
        if(num==1)
            System.out.print(num+" is neither prime nor composite number");
        else {
            while(i<=num-1)
            {
                if(num%i==0)
                {
                    p=1;
                    break;
                }
                i++;
            }
            if(p==0)
                System.out.print(num+" is a prime number");
            else
                System.out.print(num+" is a composite number");
        }
    }
}