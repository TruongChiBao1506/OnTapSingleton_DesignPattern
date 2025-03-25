package iuh.fit.se.Bai3;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hđ, String cpu) {
        if(type.equalsIgnoreCase("PC")) return new PC(ram, hđ, cpu);
        else if(type.equalsIgnoreCase("Server")) return new Server(ram, hđ, cpu);
        else return null;
    }

}
