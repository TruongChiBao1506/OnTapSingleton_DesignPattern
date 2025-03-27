package iuh.fit.se.Bai7;

public class YellowState implements TrafficLightState{

    @Override
    public void displayState() {
        System.out.println("Yellow State");
    }

    @Override
    public void nextState(TrafficLightContext context) {
        context.setState(new RedState());
    }
}
