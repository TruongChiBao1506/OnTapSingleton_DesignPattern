package iuh.fit.se.Bai4;

public class PCFactory implements ComputerAbstractFactory {
    private String hdd;
    private String ram;
    private String cpu;

    public PCFactory(String hdd, String ram, String cpu){
        this.hdd=hdd;
        this.ram=ram;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(hdd,ram,cpu);
    }
}
