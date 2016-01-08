package entities;

import controllers.Request;

/**
 * Created by mengleisun on 1/8/16.
 */
public class ElevatorButton implements Ibutton{
    public int id;
    private final int floor;
    private boolean light;
    public ElevatorButton(int floor) {
        this.floor = floor;
    }
    public void sendRequest() {
        //send
        setLight(true);
        Request request = new Request(id, floor);
    }
    public void receiveRequest() {
        setLight(false);
    }
    public void setLight(boolean signal) {
        this.light = signal;
    }
    public boolean getLight() {
        return light;
    }
}