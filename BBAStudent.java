
public class BBAStudent extends Student {

    private String name;
    private String department="BBA";

    public BBAStudent() {
        super();
        this.name="Default";
        super.setDepartment(this.department);
    }

    public BBAStudent(String name) {
        this.name=name;
        super.setDepartment(this.department);
    }

    public void details() {
        System.out.println("Name : " + this.name + " Department: " + this.department);
    }
}
