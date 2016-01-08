package controllers;

import entities.IElevator;

import java.util.*;

/**
 * Created by mengleisun on 1/8/16.
 */
public class RequestController implements IRequestController {
    HashSet<IElevator> elevators;
    Queue<Request> requestQueue = new ArrayDeque<Request>();
    public RequestController() {
        elevators = new HashSet<IElevator>();

    }
    public void addElevator(IElevator elevator) {
        elevators.add(elevator);
    }
    public void removeElevator(IElevator elevator) {
        for (IElevator e : elevators) {
            if (e.equals(elevator)) {
                elevators.remove(e);
            }
        }
    }
    public void handleRequest(Request request) {
        requestQueue.offer(request);
    }
    public void processRequest() {
        while (!requestQueue.isEmpty()) {
            //algorithms of elevator
        }
    }
}
