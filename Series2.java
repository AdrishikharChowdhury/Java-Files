import java.util.Scanner;

public class Series2 {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n= read.nextInt();
        System.out.print("Calculate\n1. 1/2!+2/3!+3/4!+4/5!+......\n2. 1/2!+1/4!+1/8!+.......\nYour choice: ");
        int ch= read.nextInt();
        double y=0;
        switch (ch)
        {
            case 1 -> {
                for(int i=1;i<=n;i++)
                {
                    int fact=1;
                    for(int j=1;j<=i+1;j++)
                    {
                        fact=fact*j;
                    }
                    y=y+((double) i /fact);
                }
            }
            case 2->{
                for(int i=1;i<=n;i++)
                {
                    int fact=1;
                    for(int j=1;j<=(int)Math.pow(2,i);j++)
                    {
                        fact=fact*j;
                    }
                    y=y+((double) 1 /fact);
                }
            }
            default->System.out.println("Wrong Input!!!! Process Terminated..........");
        }
        System.out.print("The output of the series is "+y);
    }
}