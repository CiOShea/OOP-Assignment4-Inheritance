import java.util.ArrayList;

public class Employees {

    //Arraylists of Employee object is the only field of this class (composition)
    private ArrayList<Employee> employees;

    //Constructor. Arraylist of employees initialised here.
    Employees() {
        employees = new ArrayList<>();
    }

    //Getter to allow employees Arraylist to be accessed from outside the class
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    //Method to allow Employee object to be added to employees ArrayList.
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    //Method allows user to get a list of employee objects of a specified gender (String for this is passed).
    //A new ArrayList is initialised.
    //A for loop scans through the Arraylist of employees.
    //If gender matches the passed string, this employee object is added to new ArrayList.
    //New ArrayList returned
    public ArrayList<Employee> employeesByGender(String s) {
        ArrayList<Employee> genderList = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getGender().equalsIgnoreCase(s)) {
                genderList.add(employees.get(i));
            }
        }
        return genderList;
    }

    //Exact same as the previous method, but now using the Department field of Employee
    public ArrayList<Employee> employeesByDepartment(String s) {
        ArrayList<Employee> departmentList = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getDepartment().equalsIgnoreCase(s)) {
                departmentList.add(employees.get(i));
            }
        }
        return departmentList;
    }

    //This method allows user to find an employee by a specified ID.
    //Only a single Employee object returned as we are looking for a unique ID.
    //Null Employee object is declared.
    //For loop iterates through employees Arraylist
    //if a match for provided String is found in an employee ID, Employee match = that employee. New Employee object returned
    public Employee employeeById(String s) {
        Employee match = null;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeId().equals(s)) {
                match = employees.get(i);
            }
        }
        return match;
    }

    //toString is formatted for tidy output
    public String toString() {
        return "Employees: " + employees;
    }
}
