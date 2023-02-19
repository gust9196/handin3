import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10) + 1; // 10 +1 numemr
    }
}
