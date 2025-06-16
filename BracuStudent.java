
public class BracuStudent {

    public String name;
    public String area;
    public boolean havepass = false;

    public BracuStudent(String name, String area) {
        this.name = name;
        this.area = area;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Lives in " + area);
        System.out.println("Have Bus Pass? " + havepass);
    }

    public void getPass(){
        havepass=true;
    }

    public void updateHome(String area){
        this.area=area;
    }
}
