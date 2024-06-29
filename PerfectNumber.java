import java.util.Scanner;
public class PerfectNumber{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter a number to find if its perfect or not: ");
        int per= read.nextInt();
        int i=1,fect=0;
        while(i<per)
        {
            if(per%i==0)
                fect=fect+i;
            i++;
        }
        if(per==fect)
            System.out.print(per+" is a perfect number");
        else
            System.out.print(per+" is not a perfect number");
    }
}