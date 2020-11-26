//This program inherits the attributes of the HospitalEmployee class
public class Surgeon extends Doctor {

    protected boolean operating;

    public Surgeon(String empName,int empNumber, String special, boolean isOper) {
        super(empName, empNumber, special);
        operating = isOper;
    }

    public void setIsOperating(boolean isOper) {
        operating = isOper;
    }

    public boolean getIsOperating() {
        return operating;
    }

    @Override
    public String toString() {
        return super.toString() + " operating: " + operating;
    }

    public void operate() {
        System.out.print(name + " is");
        if (operating == false) {
            System.out.print(" not");
        }
        System.out.println("operating right now.");
    }
}