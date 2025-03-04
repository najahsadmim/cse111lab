
public class UniversityTester {
    public static void main(String[] args) {
        University u1 = new University();
        University u2 = new University();
    
        System.out.println(u1);
        System.out.println(u2);

        u1.name="Imperial College London";
        u1.country="England";
        System.out.println(u1.name+", "+u1.country);

        u2.name="BRAC University";
        u2.country="Bangladesh";
        System.out.println(u2.name+", "+u2.country);

    }}
//No u1 and u2 do not have the same location in memory.
