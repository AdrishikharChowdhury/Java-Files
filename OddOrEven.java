import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args){
        Scanner read =new Scanner(System.in);
        System.out.print("Enter a number to find if it's odd or even: ");
        int a= read.nextInt();
        if(a%2==0)
            System.out.print(a+" is even");
        else
            System.out.print(a+" is odd");
        read.close();
    }
}