import java.util.Scanner;
public class Series1{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int i=1;
        double y=0;
        System.out.print("Enter the limit of the series: ");
        int n= read.nextInt();
        while(i<=n)
        {
            int j=1,fact=1;
            while(j<=i)
            {
                fact=fact*j;
                j++;
            }
            y=y+(double)i/fact;
            i++;
        }
        System.out.print("The output of the series is "+y);
    }
}