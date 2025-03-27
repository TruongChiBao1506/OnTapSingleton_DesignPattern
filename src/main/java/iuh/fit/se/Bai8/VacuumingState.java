package iuh.fit.se.Bai8;

public class VacuumingState implements RobotState {
    @Override
    public void executeCommand(String command, VacuumRobotContext context) {
        switch (command){
            case "Move":
                System.out.println("Switching to moving without vacuuming.");
                context.setState(new MovingState());
                break;
            case "Vacuum":
                System.out.println("Robot is already vacuuming.");
                break;
            case "Charge":
                System.out.println("Stopping vacuum to charge.");
                context.setState(new ChargingState());
                break;
            case "Pause":
                System.out.println("Pausing vacuuming.");
                context.setState(new PausedState());
                break;
            default:
                System.out.println("Unknown command: " + command);

        }
    }

    @Override
    public String getStateName() {
        return "Vacuuming";
    }
}
