package hexlet.code;
import java.util.Random;
public class Utils {
    public static int getRandomNumber(int minNumber, int maxNumber) {
        Random random = new Random(); // Создаем новый объект Random
        return random.nextInt(maxNumber - minNumber + 1) + minNumber;
    }

}
