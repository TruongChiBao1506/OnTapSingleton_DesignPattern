package iuh.fit.se.Bai8;

public class ChargingState implements RobotState {
    @Override
    public void executeCommand(String command, VacuumRobotContext context) {
        switch (command){
            case "Move":
                System.out.println("Cannot move while charging.");
                break;
            case "Vacuum":
                System.out.println("Cannot vacuum while charging.");
                break;
            case "Charge":
                System.out.println("Robot is already charging.");
                break;
            case "Pause":
                System.out.println("Pausing charging.");
                context.setState(new PausedState());
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }

    @Override
    public String getStateName() {
        return "Charging";
    }
}
