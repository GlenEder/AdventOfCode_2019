package Days;

import Utils.FileHandler;
import Utils.StopWatch;

public class Day1 extends Day {

    private int part1total = 0;
    private int part2total = 0;

    public Day1(int day) {
        super(day);
    }

    @Override
    public void Compute() {
        String s;
        while ( (s = this.GetFileHandler().GetNextLine()) != null ) {
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

        //end day computations, print results
        this.EndDay(part1total, part2total);
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
