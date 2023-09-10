import java.util.List;
import java.util.*;
import java.time.*;


public class MyClass {
    public static void main(String[] args) {
        // Create a Library object
        Employee2 employee1 = new Employee2("Josh","Softwear Engineer",80000);
        Employee2 employee2 = new Employee2("Ted","Data Engineer",60000);
        Employee2 employee3 = new Employee2("Tom","Web  Developer",50000);
        
        employee1.display();
        employee2.display();
        employee3.display();
        
        System.out.println("\n------ Employee'1s salary has been updated, huray!----------");
        employee1.updateSalary(300,8);
        System.out.println("---------Employee'2s salary has been updated, huray!----------");
        employee2.updateSalary(300,8);
        System.out.println("---------Employee'3s salary has been updated, huray!----------");
        employee3.updateSalary(533,8);

        
    }
}
