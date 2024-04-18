package hexlet.code;
import java.util.Random;
public class Utils {
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    private static final Random RANDOM = new Random();

    public static int getRandomNumber() {
        return RANDOM.nextInt(MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER + 1) + MIN_RANDOM_NUMBER;
    }

}
