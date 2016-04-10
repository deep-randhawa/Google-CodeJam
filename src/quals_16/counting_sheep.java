package quals_16;

import global.CodeJamTest;

import java.util.HashSet;
import java.util.List;

/**
 * Created by drandhaw on 4/9/16.
 */
public class counting_sheep extends CodeJamTest {

    public HashSet<Integer> getAllDigits(Integer N) {
        HashSet<Integer> digits = new HashSet<>();
        Integer tmp = N;
        while (tmp > 0) {
            digits.add(tmp % 10);
            tmp /= 10;
        }
        return digits;
    }

    @Override
    public String solveSingleTest(List<String> testInput) {
        Integer N = Integer.parseInt(testInput.get(0));
        if (N == 0) return "INSOMNIA";
        Integer lastSeen = N;
        Integer iteration = 1;
        Integer[] numbers = new Integer[10];
        Integer sum = 0;
        while (sum != 55) {
            lastSeen = N * iteration++;
            HashSet<Integer> thisLSDigits = getAllDigits(lastSeen);
            for (Integer digit : thisLSDigits) {
                if (numbers[digit] == null) {
                    numbers[digit] = 1;
                    sum += (digit == 0) ? 10 : digit;
                }
            }
        }
        return lastSeen.toString();
    }

    @Override
    public Integer numLinesPerTestCase() {
        return 1;
    }
}
