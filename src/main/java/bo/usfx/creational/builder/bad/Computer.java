package bo.usfx.creational.builder.bad;

public class Computer {

    private int hdd;
    private int ram;
    private String processor;
    private String graphicsCard;
    private String os;
    private boolean isGraphicsCardEnabled;

    public Computer(int hdd, int ram, String processor, String graphicsCard, String os, boolean isGraphicsCardEnabled) {
        this.hdd = hdd;
        this.ram = ram;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.os = os;
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
    }

    public Computer(int hdd, int ram, String processor, String os, boolean isGraphicsCardEnabled) {
        this.hdd = hdd;
        this.ram = ram;
        this.processor = processor;
        this.os = os;
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
    }
}
