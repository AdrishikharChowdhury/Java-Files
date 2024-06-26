import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[] ags)
    {
        Scanner read=new Scanner(System.in);
        boolean j=true;
        double x;
        do {
            System.out.print("\nConversion Menu\n1.Centigrate To Farenheit\n2.Farenheit to Centigrate\n3.Exit\nEnter your choice: ");
            int ch= read.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter the temperature in Centigrate: ");
                    x= read.nextDouble();
                    System.out.print("The resultant temperature is "+((1.8*x)+32));
                    break;
                case 2:
                    System.out.print("Enter the temperature in Farenheit: ");
                    x= read.nextDouble();
                    System.out.print("The resultant temperature is "+(5*(x-32)/9));
                    break;
                case 3:
                    j=false;
                    break;
                default:
                    System.out.print("Wrong Input!!Process Terminated.......");
            }
        }while(j);
        System.out.print("Thak you for using this program.......");
        read.close();
    }
}