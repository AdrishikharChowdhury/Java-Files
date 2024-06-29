import java.util.Scanner;
public class SimpleSwitchCase{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x= read.nextInt();
        System.out.print("Enter the value of n: ");
        int n=read.nextInt();
        double y = switch (n){
            case 1 -> 1+x;
            case 2 -> 1+((double)x/n);
            case 3 -> 1+Math.pow(x,n);
            default -> 1+(n*x);
        };
        System.out.print("The output is "+y);
    }
}