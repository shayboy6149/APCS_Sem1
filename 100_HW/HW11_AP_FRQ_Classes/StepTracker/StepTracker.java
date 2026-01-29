public class StepTracker{
    private int minsteps;
    private int totalsteps;
    private int days;
    private int activeDays;
    
}
public StepTracker(int minsteps){
    this.minsteps = minsteps;
    this.totalsteps = totalsteps;
    this.days = days;
}

public void addDailySteps(int steps){
    days++;
    totalsteps += steps;
    
    if (steps >= minsteps){
        activeDays++;
    }
    public int activeDays(){
        return activeDays;
    }
    
    public int averageSteps(){
        return totalsteps/days;
    }
    
}