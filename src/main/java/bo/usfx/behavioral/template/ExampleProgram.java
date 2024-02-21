package bo.usfx.behavioral.template;

public class ExampleProgram {

    public static void main(String[] args) {
        HouseTemplate woodenHouse = new WoodenHouse();
        HouseTemplate concreteHouse = new ConcreteHouse();

        woodenHouse.buildHouse();

        System.out.println("\n\n\n");

        concreteHouse.buildHouse();
    }
}
