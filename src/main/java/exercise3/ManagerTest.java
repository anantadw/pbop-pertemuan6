package exercise3;

/**
 *
 * @author Ananta D
 */
public class ManagerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Manager[] staff = new Manager[3];
        staff[0] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
        int i;
        
        System.out.println("Staff");
        for (i = 0; i < 3; i++) staff[i].print();
        
        System.out.println("\nRaise salary");
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();
        
        System.out.println("\nShell short");
        Sort.shell_sort(staff);
        for (i = 0; i < 3; i++) staff[i].print();
    }
}
