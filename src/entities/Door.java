package entities;

/**
 * Created by mengleisun on 1/8/16.
 */
public class Door implements IDoor {
    boolean open = false;
    public void openDoor() {
        //process open door
        open = true;
    }
    public void closeDoor() {
        //process close door
        open = false;
    }
    public boolean status() {
        return open;
    }
}
