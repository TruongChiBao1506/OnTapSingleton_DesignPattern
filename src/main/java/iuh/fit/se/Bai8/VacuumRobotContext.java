package iuh.fit.se.Bai8;

public class VacuumRobotContext {
    private RobotState state;

    public VacuumRobotContext() {
        this.state = new PausedState();
    }

    public void setState(RobotState state) {
        this.state = state;
        System.out.println("State changed to: " + state.getStateName());
    }
    public void sendCommand(String command) {
        System.out.println("Received command: " + command);
        state.executeCommand(command, this);
    }
    public String getCurrentState() {
        return state.getStateName();
    }
}
