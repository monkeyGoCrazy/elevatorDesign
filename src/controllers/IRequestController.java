package controllers;

import entities.*;

/**
 * Created by mengleisun on 1/8/16.
 */
public interface IRequestController {
    public void addElevator(IElevator elevator);
    public void removeElevator(IElevator elevator);
    public void handleRequest(Request request);
    public void processRequest();
}