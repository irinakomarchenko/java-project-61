package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    private static final int GAME_GREAT = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;
    private static final int GAME_EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GAME_GREAT + " - Greet");
        System.out.println(GAME_EVEN + " - Even");
        System.out.println(GAME_CALC + " - Calc");
        System.out.println(GAME_GCD + " - GCD");
        System.out.println(GAME_PROGRESSION + " - Progression");
        System.out.println(GAME_PRIME + " - Prime");
        System.out.println(GAME_EXIT + " - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case GAME_GREAT:
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String name = scanner.next();
                System.out.println("Hello, " + name + "!");
                break;
            case GAME_EVEN:
                Even.play();
                break;
            case GAME_CALC:
                Calc.play();
                break;
            case GAME_GCD:
                GCD.play();
                break;
            case GAME_PROGRESSION:
                Progression.play();
                break;
            case GAME_PRIME:
                Prime.play();
                break;
            case GAME_EXIT:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Unknown user choice: " + choice);
                System.exit(GAME_EXIT);
        }
    }
}
