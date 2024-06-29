public class WhileSumofevennum{
    public static void main(String[] args){
        int i=1,sum=0;
        while(i<=100)
        {
            if(i%2==0)
            sum=sum+i;
            i++;
        }
        System.out.print("The sum of even numbers from 1 to 100 is "+sum);
    }
}