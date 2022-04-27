import Days.Day1;
import Days.Day2;
import Utils.FileHandler;

public class AOC_2019 {

    //Launches daily tasks
    public static void main(String args[]) {

        //Day 1
        Day1 d1 = new Day1(1);
        d1.Compute();

        //Day 2
        Day2 d2 = new Day2(2);
        d2.Compute();
    }
}


