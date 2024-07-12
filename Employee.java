import java.time.LocalDate;
import java.time.Period;

public class Employee {
    //Step 1: Define attributes for name, salary, and hire date
    private String name;
    private double salary;
    private LocalDate hireDate;

    //Step 2: Add a constructor
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    //Step 3: Add getter methods
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    //Step 4: Add a method to calculate years of service
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }
    
    public static void main(String[] args) {
      //Step 5: Create an instance of Employee and test its functionality
      Employee employee = new Employee("Chae In Kim", 90000, LocalDate.of(2017, 9, 1));
       //Display employee details
       System.out.println("Employee Details: ");
       System.out.println("Name: " + employee.getName());
       System.out.println("Salary: $" + employee.getSalary());
       System.out.println("Hire Date: " + employee.getHireDate());

       //Calculate and display years of service
       System.out.println("Years of Service: " + employee.calculateYearsOfService());
    }
    
}

