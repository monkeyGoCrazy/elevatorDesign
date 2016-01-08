package entities;

/**
 * Created by mengleisun on 1/8/16.
 */
import handlers.*;
import enums.*;
public interface IElevator {
    public int id = 0;
    public int getCapacity();
    public void setCurrentNum(int num);
    public int getCurrentNum();
    public int getCurrentFloor();
    public void setCurrentFloor(int number);
    public boolean getMoving();
    public void setMoving(boolean value);
    public void stopElevator();
    public void startElevator();
    public ElevatorDirection getElevatorDirection();
    public void setElevatorDirection(ElevatorDirection direction);
    public void openDoor();
    public void closeDoor();
}
