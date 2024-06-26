import java.util.Scanner;
public class LargeAndSmall3{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a= read.nextInt();
        int b= read.nextInt();
        int c= read.nextInt();
        int large,small;
        if(a>b && a>c)
            large=a;
        else{
            if(b>c)
                large=b;
            else
                large=c;
        }
        if(a<b && a<c)
            small=a;
        else{
            if(b<c)
                small=b;
            else
                small=c;
        }
        System.out.println("The largest number is "+large);
        System.out.println("The smallest number is "+small);
    }
}