import java.util.Scanner;
public class Swapwithfunc {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a= read.nextInt();
        int b= read.nextInt();
        SwapWrapper swapWrapper = new SwapWrapper(a, b);
        swap(swapWrapper);
        a = swapWrapper.a;
        b = swapWrapper.b;
        System.out.print("The swapped variables are "+a+" and "+b);
    }
    public static void swap(SwapWrapper wrapper) {
        int temp = wrapper.a;
        wrapper.a = wrapper.b;
        wrapper.b = temp;
    }
}
class SwapWrapper {
    int a;
    int b;

    SwapWrapper(int a, int b) {
        this.a = a;
        this.b = b;
    }
}