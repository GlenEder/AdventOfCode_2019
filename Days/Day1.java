package Days;

import Utils.FileHandler;

public class Day1 implements Day {

    private int part1total = 0;
    private int part2total = 0;
    private double cpuTime = 0.0;

    public void Compute(FileHandler f) {
        //Start timer
        long start = System.nanoTime();

        //open todays input file
        f.CreateReader("InputFiles/day1.txt");

        String s;
        while ( (s = f.GetNextLine()) != null ) {
            //parse int from line
            int i = Integer.parseInt(s);
            i = operate(i);
            part1total += i;
            while (i > 6) {
                i = operate(i);
                part2total += i;
            }
        }

        //add part1 to part2's total
        part2total += part1total;

        //calculate computation time for logging
        cpuTime = (System.nanoTime() - start) / 1000000.0;
    }

    public void PrintResults() {
        System.out.printf("++++Day 1:++++\nPart 1: %d\nPart 2: %d\nTime: %.4fms", part1total, part2total, cpuTime);
    }

    private int operate(int i) {
        //divide by three, rounded down
        i = Math.floorDiv(i, 3);
        //subtract 2
        i -= 2;
        //return
        return i;
    }
}
