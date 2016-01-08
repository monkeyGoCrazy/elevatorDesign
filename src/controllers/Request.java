package controllers;

import enums.ElevatorDirection;

/**
 * Created by mengleisun on 1/8/16.
 */
public class Request {
    public int type = -1;
    public int floor;
    public ElevatorDirection direction = ElevatorDirection.Blank;
    public Request(int type, int floor) {
        this.type = type;
        this.floor = floor;
    }
    public Request(int type, int floor, ElevatorDirection direction) {
        this.type = type;
        this.floor = floor;
        this.direction = direction;
    }
}
