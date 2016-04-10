package quals_16;

import global.CodeJamTest;

import java.util.HashSet;
import java.util.List;

/**
 * Created by drandhaw on 4/9/16.
 */
public class coin_jam extends CodeJamTest {

    private static Integer LENGTH;
    private static Integer NUM_VALS;
    private static HashSet<String> COIN_JAMS = new HashSet<>();

    private static long valueOf(String binary, Integer base) {
        char[] numbers = binary.toCharArray();
        long result = 0;
        for (int i = numbers.length - 1; i >= 0; i--)
            if (numbers[i] == '1')
                result += Math.pow(base, (numbers.length - i - 1));
        return result;
    }

    private static String printCoinJam(HashSet<String> coinJams) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n");
        for (String jam : coinJams) {
            builder.append(jam + " ");
            for (int i = 2; i <= 10; i++)
                builder.append(getDivisor(valueOf(jam, i)) + " ");
            builder.append("\n");
        }
        return builder.toString();
    }

    private static Long getDivisor(Long num) {
        for (long i = 3; i < Math.sqrt(num); i++) {
            if (num % i == 0) return i;
        }
        if (num % 2 == 0) return 2l;
        return -1l;
    }

    private static boolean isValid(String str) {
        for (int i = 2; i <= 10; i++) {
            if (isPrime(valueOf(str, i))) return false;
        }
        return true;
    }

    private static String resolveString(String str, Integer len) {
        StringBuilder builder = new StringBuilder();
        builder.append(1);
        for (int i = 0; i < len - 2 - str.length(); i++)
            builder.append(0);
        builder.append(str);
        builder.append(1);
        return builder.toString();
    }

    private static String getBinary(Integer n) {
        int bit = 1 << LENGTH - 1 - 2;
        StringBuilder sb = new StringBuilder();
        while (bit != 0) {
            sb.append(((n & bit) != 0) ? 1 : 0);
            bit >>= 1;
        }
        return sb.toString();
    }

    private static boolean isPrime(Long n) {
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        long i = 5;
        long w = 2;

        while (i * i <= n) {
            if (n % i == 0) return false;

            i += w;
            w = 6 - w;
        }
        return true;
    }

    @Override
    public String solveSingleTest(List<String> testInput) {
        String[] inputs = testInput.get(0).split(" ");
        LENGTH = Integer.parseInt(inputs[0]);
        NUM_VALS = Integer.parseInt(inputs[1]);
        long n = ((long) Math.pow(2, LENGTH));
        for (int i = 0, numValidFound = 0; i < n && numValidFound < NUM_VALS; i++) {
            String str = resolveString(getBinary(i), LENGTH);
            if (isValid(str)) {
                COIN_JAMS.add(str);
                numValidFound++;
            }
        }
        return printCoinJam(COIN_JAMS);
    }

    @Override
    public Integer numLinesPerTestCase() {
        return 1;
    }
}
