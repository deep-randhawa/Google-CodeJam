package global;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by drandhaw on 4/9/16.
 */
public abstract class CodeJamTest {
    public void solve(String pathToInput, String pathToOutput) {
        try {
            PrintWriter writer = new PrintWriter(new File(pathToOutput));
            BufferedReader reader = new BufferedReader(new FileReader(new File(pathToInput)));

            int numTest = Integer.parseInt(reader.readLine());
            for (int test = 0; test < numTest; test++) {
                List<String> testCase = new ArrayList<>();
                for (int i = 0; i < numLinesPerTestCase(); i++) {
                    testCase.add(reader.readLine());
                }
                writer.append("Case #" + (test + 1) + ": ");
                writer.append(solveSingleTest(testCase));
                writer.append('\n');
                writer.flush();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String solveSingleTest(List<String> testInput);

    public abstract Integer numLinesPerTestCase();
}
