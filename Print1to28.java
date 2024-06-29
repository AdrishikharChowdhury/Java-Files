public class Print1to28{
    public static void main(String[] args){
        int i=1;
        while(i<=28)
        {
            System.out.print(i+"  ");
            if(i%7==0)
                System.out.println();
            i++;
        }
    }
}