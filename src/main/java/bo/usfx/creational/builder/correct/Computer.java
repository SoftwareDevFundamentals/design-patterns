package bo.usfx.creational.builder.correct;

public class Computer {

    private int hdd;
    private int ram;
    private String processor;
    private String graphicsCard;
    private boolean isGraphicsCardEnabled;

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.graphicsCard = builder.graphicsCard;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public static class ComputerBuilder {
        private int hdd;
        private int ram;
        private String processor;
        private String graphicsCard;
        private boolean isGraphicsCardEnabled;

        public ComputerBuilder() {

        }

        public ComputerBuilder setHdd(int hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setIsGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
