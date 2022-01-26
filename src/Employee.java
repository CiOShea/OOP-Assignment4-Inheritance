//Employee extends Person class as it is a child class of Person
public class Employee extends Person {

    //Fields initialised here
    private String employeeId;
    private String department;

    //Constructor method
    public Employee(String name, int phoneNumber, String gender, String employeeId, String department) {
        super(name, phoneNumber, gender);
        this.employeeId = employeeId;
        this.department = department;
    }

    //Getters for Employee ID and Department are below. Allow these fields to be accessed from outside Employee class.

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    //Following 3 Getter methods are overrides of the same classes from parent class (Person)
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    //toString method formatted for tidy output. super provided to hand over Person toString also.
    public String toString() {
        return super.toString() +
                "Employee ID: " + employeeId + '\n' +
                "Department: " + department + '\n' + " ";
    }
}
