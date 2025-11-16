import com.tnsif.assignment_packagemodifier.employees.*;
import com.tnsif.assignment_packagemodifier.utilities.EmployeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {

        EmployeeUtilities e = new EmployeeUtilities();

        Manager m = new Manager("Priya", 137, 70000, 5, "TCS");
        Developer d = new Developer("Kani", 770, 60000, 3, "Software");

        System.out.println("Manager Details: " + e.getManagerInfo(m));
        System.out.println("Developer Details: " + e.getDeveloperInfo(d));
    }
}
