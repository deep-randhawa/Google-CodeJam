package quals_16;

import global.CodeJamTest;

import java.util.List;

/**
 * Created by drandhaw on 4/9/16.
 */
public class revenge_pancakes extends CodeJamTest {

    @Override
    public String solveSingleTest(List<String> testInput) {
        Integer numFlips = 0;
        char prevCakeSide = '+';
        char[] cakes = testInput.get(0).toCharArray();
        for (int i = cakes.length - 1; i >= 0; i--) {
            if (cakes[i] != prevCakeSide) numFlips++;
            prevCakeSide = cakes[i];
        }
        return numFlips.toString();
    }

    @Override
    public Integer numLinesPerTestCase() {
        return 1;
    }
}
