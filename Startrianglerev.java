import java.util.Scanner;
public class Startrianglerev{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int m= read.nextInt();
        for(int i=1;i<=m;i++)
        {
            for(int k=0;k<=m-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}