package iuh.fit.se.Bai8;

public class Main {
    public static void main(String[] args) {
        VacuumRobotContext context = new VacuumRobotContext();
        System.out.println("Initial state: " + context.getCurrentState());

        context.sendCommand("Move");
        context.sendCommand("Vacuum");
        context.sendCommand("Pause");
        context.sendCommand("Charge");
        context.sendCommand("Move"); // Không thể di chuyển khi đang sạc
        context.sendCommand("Pause");
        context.sendCommand("Vacuum");

    }
}
