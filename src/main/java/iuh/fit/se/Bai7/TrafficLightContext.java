package iuh.fit.se.Bai7;

public class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new GreenState();
    }
    public void setState(TrafficLightState state) {
        this.state = state;
    }
    public TrafficLightState getState() {
        return state;
    }
    public void displayState() {
        state.displayState();
    }
    public void nextState() {
        state.nextState(this);
    }
}
