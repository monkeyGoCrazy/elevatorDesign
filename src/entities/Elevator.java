package entities;

import controllers.IRequestController;
import enums.ElevatorDirection;
import java.util.HashSet;
/**
 * Created by mengleisun on 1/8/16.
 */
public class Elevator implements IElevator, Comparable<IElevator> {
    public int id;
    private final int capacity = 20;
    private int number;
    private boolean running = false;
    private boolean isMoving = false;
    private int currentFloor;
    private IDoor door;
    private HashSet<ElevatorButton> set = new HashSet<ElevatorButton>();
    private IRequestController controller;
    private ElevatorDirection elevatorDirection = ElevatorDirection.Blank;
    public int compareTo(IElevator elevator) {
        return this.id - elevator.id;
    }
    public Elevator(IRequestController controller,int id) {
        IDoor door = new Door();
        this.controller = controller;
        this.id = id;

    }
    public void startElevator() {
        this.running = true;
    }
    public void stopElevator() {
        this.running = false;
    }
    public void openDoor() {
        door.openDoor();
    }
    public void closeDoor() {
        door.closeDoor();
    }
    public int getCurrentNum() {
        return number;
    }
    public void setCurrentNum(int num) {
        number = num;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public boolean getMoving() {
        return isMoving;
    }
    public void setMoving(boolean value) {

    }
    public ElevatorDirection getElevatorDirection() {
        return elevatorDirection;
    }
    public void setElevatorDirection(ElevatorDirection direction) {

    }
}
