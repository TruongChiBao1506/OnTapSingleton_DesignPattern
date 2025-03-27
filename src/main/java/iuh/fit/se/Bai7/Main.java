package iuh.fit.se.Bai7;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        System.out.println("Normal Mode Simulation:");
        for (int i = 0; i < 6; i++) {
            context.displayState();
            context.nextState();
        }

        System.out.println("Night Mode Simulation:");
        context.setState(new BlinkingYellowState());
        for (int i = 0; i < 6; i++) {
            context.displayState();
            context.nextState();
        }
    }
}
