package iuh.fit.se.Bai8;

public class MovingState implements RobotState {

    @Override
    public void executeCommand(String command, VacuumRobotContext context) {
        switch (command){
            case "MOVE":
                System.out.println("Robot is already moving.");
                break;
            case "Vacumm":
                System.out.println("Switching to vacuuming while moving.");
                context.setState(new VacuumingState());
                break;
            case "Charge":
                System.out.println("Stopping movement to charge.");
                context.setState(new ChargingState());
                break;
            case "Pause":
                System.out.println("Pausing movement.");
                context.setState(new PausedState());
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }

    @Override
    public String getStateName() {
        return "Moving";
    }
}
