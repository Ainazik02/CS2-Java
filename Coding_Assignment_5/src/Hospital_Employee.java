public class Hospital_Employee {   //Defining the class Hospital_Emplyee

    protected String name;//Declaring variables
    protected int number;

    public Hospital_Employee(String empName, int empNumber) {     // Sets up this hospital employee with the specified information.



        name = empName;
        number = empNumber;
    }

    public void setName(String empName) {// Sets the name for this employee.

        name = empName;
    }

    public void setNumber(int empNumber) { // Sets the employee number for this employee.

        number = empNumber;
    }

    public String getName() {// Returns this employee's name.

        return name;
    }

    public int getNumber() {// Returns this employee's number.

        return number;
    }

    public String toString() { // Returns a description of this employee as a string.

        return name + " " + number;
    }


    // Prints a message appropriate for this employee.
    public void work() {
        System.out.println(name + " is the youngest employee in the hospital.");
    }
}