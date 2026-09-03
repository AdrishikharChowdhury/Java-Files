import java.util.Scanner;
import java.util.Random;

public class GuessGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int min=1,max=100;
        int target=rand.nextInt(min,max+1),guess,attempts=0;
        System.out.println("This is the Guessing Game");
        System.out.printf("You have to guess a number in between %d - %d\n",min,max);
        do{
            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
            attempts++;
            if(guess>target){
                System.out.println("Too High! Try Again");
            }
            else if(guess<target){
                System.out.println("Too Low! Try Again");
            }
            else{
                System.out.println("You guessed it! It took you " + attempts + " attempts");
            }
        }while(guess!=target);
        sc.close();
    }
}