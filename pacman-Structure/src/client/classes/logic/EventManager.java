package logic;

public class EventManager{

    private EventListener[] subscribers;

    public EventManager(EventListener[] subs){
        this.subscribers = subs;
    }

    public void subscribe(EventListener subscriber){

    }

    public void unSubscribe(EventListener subcriber){

    }

    public void notifyObservers(int id, int[] data){

    }
}
