
public class Triangle {

    public int s1;
    public int s2;
    public int s3;
    public int peri;

    public Triangle(int s1, int s2, int s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public void triangleDetails() {
        System.out.println("Three sides of the triangle are: " + s1 + ", " + s2 + ", " + s3);
        peri = s1 + s2 + s3;
        System.out.println("Perimeter: " + peri);
    }

    public String printTriangleType() {
        if (s1 == s2 && s2 == s3 && s1 == s3) {
            return "This is an Equilateral triangle.";
        } else if (s1 == s2 || s1 == s3 || s2 == s3) {
            return "This is an Isosceles triangle.";
        } else {
            return "This is a Scalene triangle.";
        }
    }

    public void compareTriangles(Triangle t) {
        if (this == t) {
            System.out.println("These two triangles objects have the same address.");
        } else {
            if (this.s1 == t.s1 && this.s2 == t.s2 && this.s3 == t.s3) {
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            } else if ((this.s1 != t.s1 || this.s2 != t.s2 || this.s3 != t.s3) && this.peri != t.peri) {
                System.out.println("Addresses, length of sides and perimeter all are different.");
            } else {
                System.out.println("Only the perimeter of both triangles in equal.");
            }
        }
    }
}
