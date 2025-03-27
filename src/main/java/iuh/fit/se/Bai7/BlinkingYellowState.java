package iuh.fit.se.Bai7;

public class BlinkingYellowState implements TrafficLightState{

    @Override
    public void displayState() {
        System.out.println("Traffic Light: BLINKING YELLOW - Caution, slow down");
    }

    @Override
    public void nextState(TrafficLightContext context) {
        context.setState(this);
    }
}
