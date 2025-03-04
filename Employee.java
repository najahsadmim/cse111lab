
public class Employee {

    public String name;
    public double salary = 30000.0;
    public String designation = "junior";

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Designation: " + designation);
    }

    public void newEmployee(String name) {
        this.name = name;
    }

    double tax;
    public void calculateTax() {
        if (salary > 30000 && salary < 50000) {
            tax = 0.1 * salary;
        } else if (salary > 50000) {
            tax = 0.3 * salary;
        } else {
            System.out.println("No need to pay tax");
        }
        System.out.println(name + " Tax Amount: " + tax);
    }

    public void promoteEmployee(String designation) {
        this.designation = designation;
        if (designation == "senior") {
            salary += 25000;
        } else if (designation == "lead") {
            salary += 50000;
        } else if (designation == "manager") {
            salary += 75000;
        } else {
            System.out.println("Invalid designation");
        }
        System.out.println(name + " has been promoted to " + this.designation);
        System.out.println("New Salary: " + salary);
    }
}
