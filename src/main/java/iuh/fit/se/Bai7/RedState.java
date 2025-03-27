package iuh.fit.se.Bai7;

public class RedState implements TrafficLightState{

    @Override
    public void displayState() {
        System.out.println("red state");
    }

    @Override
    public void nextState(TrafficLightContext context) {
        context.setState(new GreenState());
    }
}
