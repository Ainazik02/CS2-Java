//This program inherits the attributes of the Hospital_Employee class
public class Administrator extends Hospital_Employee{
    protected String department;

    public Administrator (String empName, int empNumber, String dept){
        super (empName, empNumber);
        department = dept;
    }
    public void setDepartment (String dept){
        department = dept;
    }
    public String getDepartment(){
        return department;
    }
    public String toString(){
        return super.toString() + " works in " + department + " office";
    }
    public void administrate(){
        System.out.println (name + " works in the " + department + " department.");
    }
}
