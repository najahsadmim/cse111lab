
public class Course {

    public String courseName;
    public String courseCode;
    public int credit;

    public void updateDetails(String courseName, String courseCode, int credit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credit = credit;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Code: " + this.courseCode);
        System.out.println("Course Credit: " + this.credit);
    }
}
