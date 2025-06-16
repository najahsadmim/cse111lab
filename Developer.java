
public class Developer extends Employee {

    public String lang;
    public double finalSalary;

    public Developer(String name, double baseSalary, int hoursWorked, String lang) {
        super(name, baseSalary, hoursWorked);
        this.lang = lang;
        this.finalSalary=baseSalary;
    }

    public void calculateSalary() {
        if (lang == "Java") {
            finalSalary = super.getBaseSalary() + 700;
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + super.getBaseSalary());
        System.out.println("Work Hours: " + super.getHoursWorked());
        System.out.println("Language: " + lang);
        System.out.println("Final Salary: $" + finalSalary);
    }

}
