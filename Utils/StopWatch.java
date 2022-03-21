package Utils;

public class StopWatch {

    //nano time of last start time
    private long lastUpdate = 0;

    public StopWatch() {
        StartStopWatch();
    }

    //Starts stop watch
    public void StartStopWatch() {
        lastUpdate = System.nanoTime();
    }

    //Returns time since start in nanoseconds
    public long TimeSinceNS() {
        return System.nanoTime() - lastUpdate;
    }

    //Returns time since start in milliseconds
    public double TimeSinceMS() {
        return  TimeSinceNS() / 1000000.0;
    }
}
