import java.util.Scanner;
public class simpleifelse{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("The value of x: ");
        int x= read.nextInt();
        if(x<4)
            System.out.println("The output is "+(int)Math.pow(x,2));
        else
            System.out.println("Program Terminated......");
    }
}