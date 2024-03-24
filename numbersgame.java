import java.util.Random;
import java.util.Scanner;
public class numbersgame{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random random=new Random();

    int guessint=random.nextInt(100) + 1;
    int attempt=0;
    boolean numberguess=false;
    System.out.println("welcome to number game  ");
    while (!numberguess) {
        System.out.println("enter your guess:");
        int guess=sc.nextInt();
        attempt++;
        if(guess< guessint){
            System.out.println("TOO LOW");
        }
        else if(guess> guessint ){
            System.out.println("TOO HIGH");
        }
        else{
            numberguess=true;
        }
    }

    System.out.println("CONGRATULATIONS  YOU  FOUND  IT  IN "   + attempt +   " attempts. ");

}
}

    

