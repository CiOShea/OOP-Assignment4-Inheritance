public class Test {
    public static void main(String[] args) {
        //In this test class I first instantiate an empty Employees class (ArrayList)
        //I then instantiate the Patient and Employee objects.
        //The employee objects are then added to the ArrayList in Employees class.
        //Methods for Employees class are tested below (Most are commented out as I like to test individually)

        Employees empList = new Employees();

        Patient patient1 = new Patient("Cian O'Shea" , 837253861 , "Male" , "B2384" , "O");

        Employee emp1 = new Employee("Emma Clarke" , 877653271 , "Female" , "A328" , "Cardiology");
        Employee emp2 = new Employee("John Smith" , 863459873 , "Male" , "A023" , "Neurology");
        Employee emp3 = new Employee("Gillian Dunne" , 859837283 , "Female" , "A354" , "Cardiology");
        Employee emp4 = new Employee("Henry O'Reilly" , 893765424 , "Male" , "A434" , "Gastroenterology");
        Employee emp5 = new Employee("Emily Keane" , 833874625 , "Female" , "A476" , "Neurology");

        empList.addEmployee(emp1);
        empList.addEmployee(emp2);
        empList.addEmployee(emp3);
        empList.addEmployee(emp4);
        empList.addEmployee(emp5);

//        System.out.println(patient1);
//        System.out.println();
//        System.out.println(emp1);

//        System.out.println(empList.employeesByDepartment("Cardiology"));
//
//        System.out.println(empList.employeesByGender("Male"));
//
//        System.out.println(empList.getEmployees().get(0).getName());



        System.out.println(empList.employeesByDepartment("Neurology"));



    }
}
