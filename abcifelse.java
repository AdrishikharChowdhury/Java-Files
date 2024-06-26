import java.util.Scanner;
public class abcifelse{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the values of a,b,c: ");
        int a= read.nextInt();
        int b= read.nextInt();
        int c= read.nextInt();
        if(a>c && b>c)
        {
            c=c+10;
            System.out.println("The new value of c is "+c);
        }
        else {
            if (a<c || b<c)
            {
                a = a - 2;
                System.out.println("The sum of a and b is " + (a + b));
            }
        }
    }
}