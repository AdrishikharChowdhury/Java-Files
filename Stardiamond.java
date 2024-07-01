import java.util.Scanner;
public class Stardiamond{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int m= read.nextInt();
        for(int i=1;i<=m;i++) {
            for (int k = 0; k <= m - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=m-1;i>=0;i--)
        {
            for(int k=0;k<=m-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}