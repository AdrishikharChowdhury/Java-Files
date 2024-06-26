import java.util.Scanner;
public class RameshSalary{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.print("Enter Ramesh's Basic Salary: ");
        int basic=read.nextInt();
        double da=basic*0.4;
        double hra=basic*0.2;
        double gross=basic+da+hra;
        System.out.print("Ramesh's Gross Salary is "+ gross);
    }
}