package iuh.fit.se.Bai8;

public class PausedState implements RobotState {
    @Override
    public void executeCommand(String command, VacuumRobotContext context) {
        switch (command){
            case "Move":
                System.out.println("Resuming with movement.");
                context.setState(new MovingState());
                break;
            case "Vacuum":
                System.out.println("Resuming with vacuum.");
                context.setState(new VacuumingState());
                break;
                case "Charge":
                System.out.println("Resuming with charging.");
                context.setState(new ChargingState());
                break;
                case "Pause":
                System.out.println("Robot is already paused.");
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }

    @Override
    public String getStateName() {
        return "Pause";
    }
}
