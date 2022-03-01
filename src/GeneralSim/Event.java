package GeneralSim;

public abstract class Event {
    float time;
    protected EventQueue eventQueue;

    protected abstract void doEvent(State state);
    protected abstract String getEventName(); 
    
}