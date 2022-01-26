//Patient extends Person class as it is a child class of Person
public class Patient extends Person {

    //Private fields initialised
    private String patientId;
    private String bloodType;

    //Constructor method
    public Patient(String name, int phoneNumber, String gender, String patientId, String bloodType) {
        super(name, phoneNumber, gender);
        this.patientId = patientId;
        this.bloodType = bloodType;
    }

    //getter method for patient ID to allow access to patient ID from outside the class
    public String getPatientId() {
        return patientId;
    }

    //Getter for Blood Type
    public String getBloodType() {
        return bloodType;
    }

    //The following three Getter methods are overridden from the parent class (Person)
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
                "Patient ID: " + patientId + '\n' +
                "Blood Type: " + bloodType + '\n';
    }
}
