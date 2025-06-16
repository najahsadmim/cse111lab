
public class Manager extends Employee {

    public double bonus;
    public double finalSalary;

    public Manager(String name, double baseSalary, int hoursWorked, double bonus) {
        super(name, baseSalary, hoursWorked);
        this.bonus = bonus;
        this.finalSalary=baseSalary;
    }

    public void calculateSalary() {
        if (super.getHoursWorked() > 40) {
            finalSalary =super.getBaseSalary() + super.getBaseSalary() * (bonus / 100);
        }
    }

    public void requestIncrement(int amount) {
        if (super.getHoursWorked() > 80 && super.getHoursWorked() < 100) {
            double inc=amount/ 2;
            System.out.println("$" + inc + " Increment approved.");
            super.setBaseSalary(getBaseSalary()+inc);
        } else if (super.getHoursWorked() > 100) {
            System.out.println("$" + amount + " Increment approved.");
            super.setBaseSalary(getBaseSalary()+amount);
        } else {
            System.out.println("Increment denied.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + super.getBaseSalary());
        System.out.println("Work Hours: " + super.getHoursWorked());
        System.out.println("Bonus: " + bonus + " %");
        System.out.println("Final Salary : $" + finalSalary);
    }

}
