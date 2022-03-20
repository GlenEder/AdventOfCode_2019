package Days;

import Utils.FileHandler;

public interface Day {
    public long cpuTime = 0;
    public void Compute(FileHandler f);
    public void PrintResults();
}
