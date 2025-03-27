package iuh.fit.se.Bai7;

public interface TrafficLightState {
    public void displayState();
    public void nextState(TrafficLightContext context);
}
