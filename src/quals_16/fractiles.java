package quals_16;

import global.CodeJamTest;

import java.util.List;

/**
 * Created by drandhaw on 4/9/16.
 */
public class fractiles extends CodeJamTest {
    @Override
    public String solveSingleTest(List<String> testInput) {
        int numTiles, complexity, numStudents;
        String[] inputs = testInput.get(0).split(" ");
        numTiles = Integer.parseInt(inputs[0]);
        complexity = Integer.parseInt(inputs[1]);
        numStudents = Integer.parseInt(inputs[2]);
        return null;
    }

    @Override
    public Integer numLinesPerTestCase() {
        return 1;
    }
}
