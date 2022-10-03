import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random generator = new Random();

        int computerNum = generator.nextInt(10)+1;
        int guess = 0;

        System.out.println("Enter your guess.");
        guess = kb.nextInt();

        if (guess == computerNum)
        {
            System.out.println("You guessed the number correctly! Congrats!");
        }
        if (guess < computerNum)
        {
            System.out.println("The computer chose " + computerNum + ". Your guess was lower.");
        }
        if (guess > computerNum)
        {
            System.out.println("The computer chose " + computerNum + ". Your guess was higher.");
        }






    }
}