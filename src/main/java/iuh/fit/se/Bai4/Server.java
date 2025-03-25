package iuh.fit.se.Bai4;

public class Server extends Computer{
    private String cpu;
    private String ram;
    private String hdd;

    public Server(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
