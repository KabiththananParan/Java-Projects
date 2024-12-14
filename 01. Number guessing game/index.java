import java.lang.Math;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int randNum = 1 + (int) (Math.random() * 10);

        //System.out.println(randNum);

        Scanner myScanner = new Scanner(System.in);

        for(int i = 1; i <= 5; i++) {
            System.out.println("Chance: " + i);

            System.out.print("Input your guess : ");
            int guessNum = myScanner.nextInt();

            if(guessNum == randNum) {
                System.out.println("You won");
                break;
            }
            else if(guessNum > randNum) {
                System.out.println("Your guess is greater than computer guess!");
            }
            else if(guessNum < randNum) {
                System.out.println("Your guess is less than computer guess!");
            }

            if(i == 5) {
                System.out.println("You lost! Computer guess is " + randNum);
            }
        }

        myScanner.close();
    }
}