//This program inherits the attributes of the HospitalEmployee class
public class Nurse extends Hospital_Employee {

    protected int numPatients;

    public Nurse(String empName, int empNumber, int numPat) {  //Define the parameterized constructor.


        super(empName, empNumber);
        numPatients = numPat;
    }

    public void setNumPatients(int pat) {
        numPatients = pat;
    }

    public int getNumPatients() {
        return numPatients;
    }

    public String toString() {
        return super.toString() + " has " + numPatients + " patients this week.";
    }

    public void assist() {
        System.out.println(name + " is a nurse with " + numPatients + " patients.");
    }
}
