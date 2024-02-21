package bo.usfx.structural.adapter;

public class ExampleProgram {

    public static void main(String[] args) {
        Movable toyotaCar = new Toyota();

        toyotaCar.getSpeed(); // Mph


        MovableAdapter toyotaCarAdapter = new MovableAdapterImpl(toyotaCar);

        toyotaCarAdapter.getSpeed(); // Kmh
    }
}
