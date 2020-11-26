//This program inherits the attributes of the HospitalEmployee class
public class Doctor extends Hospital_Employee {

    protected String speciality;

    public Doctor(String empName, int empNumber, String special) {
        super(empName, empNumber);
        speciality = special;
    }

    public void setSpecialty(String special) {
        speciality = special;
    }

    public String getSpecialty() {
        return speciality;
    }

    public String toString() {
        return super.toString() + " " + speciality;
    }

    public void diagnose() {
        System.out.println(name + " is a " + speciality + " doctor.");
    }
}