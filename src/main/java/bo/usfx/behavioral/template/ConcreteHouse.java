package bo.usfx.behavioral.template;

public class ConcreteHouse extends HouseTemplate {

    @Override
    public void buildPillar() {
        System.out.println("Building pillars with concrete...");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building walls with concrete...");
    }
}
