package bo.usfx.behavioral.template;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildPillar() {
        System.out.println("Building pillars with wood...");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building walls with wood...");
    }
}
