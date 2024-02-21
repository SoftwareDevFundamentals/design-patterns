package bo.usfx.behavioral.template;

public abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillar();
        buildWalls();
        buildWindows();
        System.out.println("Completed!");
    }

    private void buildFoundation() {
        System.out.println("Building foundation...");
    }

    public abstract void buildPillar();

    public abstract void buildWalls();

    private void buildWindows() {
        System.out.println("Building windows...");
    }
}
