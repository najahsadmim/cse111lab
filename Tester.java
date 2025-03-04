
public class Tester {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name="Bob";
        s1.id="11";
        s2.name="Carol";
        s2.id="33";
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s2.name);
        System.out.println(s2.id);
        s1.display();
        System.out.println("============");
        s2.display();
    }
}
