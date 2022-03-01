package ShoppingSim.Events;

import GeneralSim.Event;
import GeneralSim.StartEvent;
import GeneralSim.State;

public class OpenEvent extends StartEvent {

    @Override
    protected void doEvent(State state) {
        // TODO Auto-generated method stub
    }

    @Override
    protected String getEventName() {
        return "OpenEvent";
    }
    
}


class ArrivalEvent extends Event {

    @Override
    protected void doEvent(State state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected String getEventName() {
        return "ArrivalEvent";
    }
    
}


class ShopEvent extends Event {

    @Override
    protected void doEvent(State state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected String getEventName() {
        return "ShopEvent";
    }
    
}


class PayEvent extends Event {

    @Override
    protected void doEvent(State state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected String getEventName() {
        return "PayEvent";
    }
    
}


class CloseEvent extends Event {

    @Override
    protected void doEvent(State state) {
        // TODO Auto-generated method stub


    }

    @Override
    protected String getEventName() {
        return "CloseEvent";
    }
    
}
