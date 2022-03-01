package GeneralSim;

public class StartEvent extends Event {

    @Override
    protected void doEvent(State state) {
        state.running = true;        
    }

    @Override
    protected String getEventName() {
        return "StartEvent";
    }
}
