import Days.Day1;
import Days.Day2;
import Utils.FileHandler;

public class AOC_2019 {

    //Launches daily tasks
    public static void main(String args[]) {

        //Create file handler for reading inputs
        FileHandler fh = new FileHandler();

        //Day 1
        Day1 d1 = new Day1();
        d1.Compute(fh);
        d1.PrintResults();

        //Day 2
        Day2 d2 = new Day2();
        d2.Compute(fh);
        d2.PrintResults();

        //Close file handler
        fh.CloseReader();
    }
}


