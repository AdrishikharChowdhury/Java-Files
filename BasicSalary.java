import java.util.Scanner;
public class BasicSalary{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        System.out.print("Enter your basic salary: ");
        int salary= read.nextInt();
        double da,hra,gross;
        if(salary<=5000)
        {
            da=salary*0.2;
            hra=salary*0.3;
            gross=salary+da+hra;
        }
        else if (salary>5001)
        {
            da=salary*0.1;
            hra=salary*0.2;
            gross=salary+da+hra;
        }
        else {
            System.out.println("No DA or HRA");
            gross=salary;
        }
        System.out.print("The gross amount is "+gross);
    }
}