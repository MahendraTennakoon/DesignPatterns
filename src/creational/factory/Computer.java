package creational.factory;

public abstract class Computer {
    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    @Override
    public String toString() {
        return String.format("RAM: %s, HDD: %s, CPU: %s", this.getRam(), this.getHdd(), this.getCpu());
    }
}
