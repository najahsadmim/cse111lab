
public class Usis {

    public int totalAdvisee = 0;
    public Student std[] = new Student[5];

    public Usis() {
        System.out.println("Usis is ready to use!");
    }

    public void login(Student s) {
        if (s.email != null && s.password != null) {
            s.status = "Login successful";
            System.out.println(s.status);
        } else {
            s.status = "Email and password need to be set.";
            System.out.println(s.status);
        }
    }

    public void advising(Student s) {
        if (s.status != "Login successful") {
            System.out.println("Please login to advise courses.");
        } else {
            if (s.count==0){
                System.out.println("You haven't selected any courses.");
            }
        }
        
    }
    

    public void advising(Student s, String c1, String c2, String c3) {
        if (s.status != "Login successful") {
            System.out.println("Please login to advise courses.");
        } else {
            s.courses[0] = c1;
            s.courses[1] = c2;
            s.courses[2] = c3;
            s.count=3;
            std[totalAdvisee]=s;
            totalAdvisee++;
            System.out.println("Advising successful!");
        }
    }

    public void advising(Student s, String c1, String c2, String c3, String c4) {
        if (s.status != "Login successful") {
            System.out.println("Please login to advise courses.");
        } else {
            System.out.println("You need special approval to take more than 3 courses.");
        }
    }

    public void allAdviseeInfo(){
        System.out.println("Total Advisee: "+totalAdvisee);
        for (int i=0; i<totalAdvisee; i++){
            System.out.println("Name: "+std[i].name+" ID: "+std[i].id);
            System.out.println("Department: "+std[i].dept);
            System.out.println("Advised courses: ");
            for (int j=0; j<std[i].count; j++){
                System.out.print(std[i].courses[j]+" ");
            }
            System.out.println("\n===============");
        }
    }
}
