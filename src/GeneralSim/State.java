package GeneralSim;

import java.util.Observable;

public class State extends Observable {
    protected boolean running;
    protected float currentTime;


    public boolean isRunning() {
        return running;
    }


    public void setRunning(boolean running) {
        this.running = running;
    }


    public float getCurrentTime() {
        return currentTime;
    }

}
