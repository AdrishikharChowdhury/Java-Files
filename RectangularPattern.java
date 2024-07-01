import java.util.Scanner;
public class RectangularPattern{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int m= read.nextInt();
        System.out.print("Enter no. of columns: ");
        int n= read.nextInt();
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}