package kr.codesquad;

import java.util.Random;

public class RandomGenerator {
    public static boolean generate() {
        Random random = new Random();
        return (random.nextInt(2) == 1) ? true : false;
    }
}
