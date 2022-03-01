package GeneralSim;

public class Simulator {
    private State state;
    private EventQueue eventQueue;
    private View view;

    Simulator(State state, EventQueue eventQueue, View view) {
        this.state      = state;
        this.eventQueue = eventQueue;
        this.view       = view;
    }
}
