package bo.usfx.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employeesList;

    public Employees() {
        this.employeesList = new ArrayList<>();
    }

    public Employees(List<String> employeesList) {
        this.employeesList = employeesList;
    }

    public void loadData() {
        employeesList.add("Walter");
        employeesList.add("Jeese");
        employeesList.add("Hank");
        employeesList.add("Mike");
        // simulates DB Operations
    }

    public List<String> getEmployeesList() {
        return employeesList;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>();
        for (String employee : employeesList) {
            temp.add(employee);
        }
        return new Employees(temp);
    }
}
