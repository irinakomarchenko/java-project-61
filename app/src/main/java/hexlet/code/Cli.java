package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static void startGame() {
        //select game 1 or 2
        sayHello(); // only if 1
    }
    public static void sayHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    //method - game 2 {sayHello()...}
}
