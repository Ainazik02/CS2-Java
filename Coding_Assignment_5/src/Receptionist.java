//This program inherits the attributes of the HospitalEmployee class
public class Receptionist extends Administrator {

    protected boolean answering;

    public Receptionist(String empName, int empNumber, String dept, boolean ans) {
        super(empName, empNumber, dept);
        answering = ans;
    }

    public void setIsAnswering(boolean isA) {
        answering = isA;
    }

    public boolean getIsAnswering() {
        return answering;
    }

    public String toString() {
        return super.toString() + " and Answering: " + answering;
    }

    public void answer() {
        System.out.print(name + " is");
        if (answering == false) {
            System.out.print(" not");
        }
        System.out.println(" answering the phone at the moment.");
    }
}
