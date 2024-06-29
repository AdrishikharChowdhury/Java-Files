import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a= read.nextInt();
        int b= read.nextInt();
        System.out.print("Enter your option\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nYour choice: ");
        int ch= read.nextInt();
        double y=0;
        switch (ch){
            case 1->y=a+b;
            case 2->y=a-b;
            case 3->y=a*b;
            case 4 ->
            {
                if(b==0)
                    System.out.println(a+" can't be divided by 0");
                else
                    y= (double) a /b;
            }
            default-> System.out.print("Wrong Input Process Terminated.......");
        }
        System.out.print("The result is "+y);
    }
}