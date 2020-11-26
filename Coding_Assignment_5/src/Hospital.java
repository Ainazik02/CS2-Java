//Class given by the Professor. It is used as the parent of multiple classes
public class Hospital { //class for testing of function of other classes
    public static void main(String[] args) { //defining main function
        //Defining names, employee numbers and so on
        Hospital_Employee vito = new Hospital_Employee("Vito", 123);
        Doctor michael = new Doctor("Michael", 234, "Heart");
        Surgeon vincent = new Surgeon("Vincent", 645, "Brain", true);
        Nurse sonny = new Nurse("Sonny", 789, 6);
        Administrator luca = new Administrator("Luca", 375, "Buisness");
        Receptionist tom = new Receptionist("Tom", 951, "Talking", true);
        Janitor anthony = new Janitor("Anthony", 123, "Maintenence", false);


        //Calling the functions of each class to display according information
        System.out.println(vito);
        System.out.println(michael);
        System.out.println(vincent);
        System.out.println(sonny);
        System.out.println(luca);
        System.out.println(tom);
        System.out.println(anthony);

        vito.work();
        michael.diagnose();
        vincent.operate();
        sonny.assist();
        luca.administrate();
        tom.answer();
        anthony.sweep();

    }

}
