package GeneralSim;

public class EndEvent extends Event {

    @Override
    protected  void doEvent(State state) {
        state.running = false;        
    }

    @Override
    protected String getEventName() {
        return "EndEvent";
    }
    
}
