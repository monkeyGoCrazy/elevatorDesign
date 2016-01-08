package entities;

/**
 * Created by mengleisun on 1/8/16.
 */
public interface Ibutton {
    public void sendRequest();
    public void receiveRequest();
    public void setLight(boolean signal);
    public boolean getLight();
}
