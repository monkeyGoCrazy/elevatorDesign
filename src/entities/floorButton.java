package entities;

import controllers.Request;
import enums.ElevatorDirection;

/**
 * Created by mengleisun on 1/8/16.
 */
public class floorButton implements Ibutton{
    private final int floor;
    private final ElevatorDirection direction;
    private boolean light;
    public floorButton(int floor, ElevatorDirection direction) {
        this.floor = floor;
        this.direction = direction;
    }
    public void sendRequest() {
        //send
        setLight(true);
        Request request = new Request(0, floor, direction);
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
