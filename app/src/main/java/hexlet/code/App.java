package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String name = scanner.next();
                System.out.println("Hello, " + name + "!");
                break;
            case 2:
                Even.play();
                break;
            case 3:
                Calc.play();
                break;
            case 4:
                GCD.play();
                break;
            case 5:
                Progression.play();
                break;
            case 6 :
                Prime.play();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.exit(0);
        }
    }
}
