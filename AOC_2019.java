import Days.Day1;
import Utils.FileHandler;

public class AOC_2019 {

    //Launches daily tasks
    public static void main(String args[]) {

        //Create file handler for reading inputs
        FileHandler fh = new FileHandler();

        Day1 d1 = new Day1();
        d1.Compute(fh);
        d1.PrintResults();
    }
}


