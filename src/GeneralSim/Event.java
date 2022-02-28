package GeneralSim;

public abstract class Event {
    float time;
    protected EventQueue eventQueue;

    protected abstract void doEvent(State state);
    protected abstract String getEventName(); 
    
}




class StartEvent extends Event {

    @Override
    protected void doEvent(State state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected String getEventName() {
        // TODO Auto-generated method stub
        return null;
    }

}


class EndEvent extends Event {

    @Override
    protected  void doEvent(State state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected String getEventName() {
        // TODO Auto-generated method stub
        return null;
    }
    
}