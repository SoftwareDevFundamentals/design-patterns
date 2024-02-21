package bo.usfx.creational.prototype;

public class ProgramExample {

    public static void main(String[] args) {
        Employees obj1 = new Employees();
        obj1.loadData();

        Employees obj2 = (Employees) obj1.clone();
        obj2.getEmployeesList().add("Heinsenberg");
    }
}
