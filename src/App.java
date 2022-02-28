public class App {
    public static void main(String[] args) throws Exception {
        new OpenEvent().doEvent();
        new StartEvent().doEvent();
    }
}

abstract class Event {
    abstract void doEvent();
}


class StartEvent extends Event {

    @Override
    void doEvent() {
        System.out.println("StartEvent");                
    }

}


class OpenEvent extends StartEvent{

    @Override
    void doEvent() {
        super.doEvent();
        System.out.println("OpenEvent");        
    }
}