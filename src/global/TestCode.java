package global;


import quals_16.fractiles;
import quals_16.revenge_pancakes;

/**
 * Created by deep on 3/11/15.
 */
public class TestCode {
    public static void main(String[] args) {
        final String dir_2016 = "src/quals_16/test_files/";
        final String input = "input/";
        final String output = "output/";

		/* QUALIFICATION ROUND 2016 */
//        counting_sheep cs = new counting_sheep();
//        cs.solve(dir_2016 + input + "Counting_Sheep.in", dir_2016 + output + "Counting_Sheep.out");
//        cs.solve(dir_2016 + input + "A-small-attempt0.in", dir_2016 + output + "A-small-attempt0.out");
//        cs.solve(dir_2016 + input + "A-large.in", dir_2016 + output + "A-large.out");

//        revenge_pancakes rp = new revenge_pancakes();
//        rp.solve(dir_2016 + input + "revenge_pancakes.in", dir_2016 + output + "revenge_pancakes.out");
//        rp.solve(dir_2016 + input + "B-small-attempt0.in", dir_2016 + output + "B-small-attempt0.out");
//        rp.solve(dir_2016 + input + "B-large.in", dir_2016 + output + "B-large.out");

//        coin_jam cj = new coin_jam();
//        cj.solve(dir_2016 + input + "coin_jam.in", dir_2016 + output + "coin_jam.out");
//        cj.solve(dir_2016 + input + "coin_jam_large.in", dir_2016 + output + "coin_jam_large.out");
//        cj.solve(dir_2016 + input + "C-small-attempt0.in", dir_2016 + output + "C-small-attempt0.out");
//        cj.solve(dir_2016 + input + "C-large.in", dir_2016 + output + "C-large.out");

        fractiles fc = new fractiles();
        fc.solve(dir_2016 + input + "fractiles.in", dir_2016 + output + "fractiles.out");
    }
}