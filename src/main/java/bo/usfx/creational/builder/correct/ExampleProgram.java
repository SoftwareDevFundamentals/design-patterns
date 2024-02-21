package bo.usfx.creational.builder.correct;

public class ExampleProgram {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setHdd(256)
                .setRam(64)
                .setProcessor("13H5000")
                .build();
    }
}
