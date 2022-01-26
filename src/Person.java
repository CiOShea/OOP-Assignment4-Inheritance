//Parent class is abstract to prevent direct instances being created. Only want child classes instantiated.
public abstract class Person {

    //Private fields initialised
    private String name;
    private int phoneNumber;
    private String gender;

    //Constructor method
    public Person(String name, int phoneNumber, String gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    //No setters in this class as per assignment brief.

    //Getter method for name
    public String getName() {
        return name;
    }

    //Getter for Phone number
    public int getPhoneNumber() {
        return phoneNumber;
    }

    //Getter for gender
    public String getGender() {
        return gender;
    }

    //To string, formatted for tidy output in the console
    public String toString() {
        return "" + '\n' +
                "Name: " + name + '\n' +
                "Phone Number: " + phoneNumber + '\n' +
                "Gender: " + gender + '\n';
    }
}
