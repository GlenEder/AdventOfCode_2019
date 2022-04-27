package Days;

import Utils.FileHandler;
import Utils.StopWatch;

public abstract class Day {
    private int day;
    private FileHandler fileHandler;
    private StopWatch watch;

    //Creates new stop watch to capture cpu time
    public Day(int day) {
        this.day = day;
        this.fileHandler = new FileHandler();
        this.watch = new StopWatch();

        //read in day's input file to file handler buffer
        this.OpenInput();
    }

    public void Compute() {
        this.EndDay(0,0);
    }

    public void EndDay(int part1total, int part2total) {
        PrintResults(part1total, part2total);
        this.fileHandler.CloseReader();
    }

    //This is expected to be called at the end of the compute method
    public void PrintResults(int part1total, int part2total) {
        System.out.printf("++++Day %d:++++\nPart 1: %d\nPart 2: %d\nTime: %.4fms", this.day, part1total, part2total, this.GetCpuTime());
    }

    protected void finalize() {

    }

    public FileHandler GetFileHandler(){
        return this.fileHandler;
    }

    private double GetCpuTime() {
        return this.watch.TimeSinceMS();
    }

    private void OpenInput() {
        //read in today's input file (follows format "day%d.txt")
        String filename = "./InputFiles/day" + this.day + ".txt";
        this.fileHandler.CreateReader(filename);
    }


}
