import java.util.Scanner;
public class IfElse{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the input of x: ");
        int x= read.nextInt();
        if(x<5)
            System.out.print("The result is "+(int)Math.pow(x,3));
        else
            System.out.print("The result is "+(int)Math.pow(x,2));
    }
}