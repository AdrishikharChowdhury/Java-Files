import java.util.Scanner;
public class Sumoftwodigit{
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        System.out.print("Enter the two digit number: ");
        int num=read.nextInt();
        int rem=num%10;
        int q=num/10;
        System.out.print("The sum of two digit number is "+(rem+q));
    }
}