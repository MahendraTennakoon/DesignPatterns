package creational.factory;

public class Server extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public String getRam() {
        return this.ram;
    }

    public String getHdd() {
        return this.hdd;
    }

    public String getCpu() {
        return this.cpu;
    }
}
