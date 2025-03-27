package iuh.fit.se.Bai7;

public class GreenState implements TrafficLightState{

    @Override
    public void displayState() {
        System.out.println("Traffic Light: GREEN - Vehicles can go");
    }

    @Override
    public void nextState(TrafficLightContext context) {
        context.setState(new YellowState());
    }
}
