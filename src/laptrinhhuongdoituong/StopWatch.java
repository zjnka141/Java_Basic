package laptrinhhuongdoituong;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start(){
        Date date=new Date();
        this.startTime=date.getTime();
    }

    public void end(){
        Date date=new Date();
        this.endTime=date.getTime();
    }

    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }
}
