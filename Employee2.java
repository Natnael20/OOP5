import static java.lang.System.*;
public class Employee2 {
    
    private String name;
    private String jobTitle;
    private int salary;
    
    // Constructor
    public Employee2(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name (if needed)
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for jobTitle
    public String getJobTitle() {
        return jobTitle;
    }

    // Setter method for jobTitle (if needed)
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Getter method for salary
    public int getSalary() {
        return salary;
    }

    // Setter method for salary (if needed)
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void updateSalary(int hourlyRate, int dailyHours) {
        int updated = hourlyRate * dailyHours * 4;
        int currentSalary = this.salary + updated;
        System.out.println("Updated salary " + currentSalary);
    }
    
    public void display() {
        out.println("Name " + getName());
        out.println("Job title "  + getJobTitle());
        out.println("Salary " + getSalary());
    }
}
