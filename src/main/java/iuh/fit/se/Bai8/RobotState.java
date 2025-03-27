package iuh.fit.se.Bai8;

public interface RobotState {
    void executeCommand(String command, VacuumRobotContext context);
    String getStateName();
}
