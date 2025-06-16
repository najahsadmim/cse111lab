
public class Shape2D {

    public int n1 = 5;
    public String shape = "Square";
    public double area = 25.0;

    public Shape2D() {
        System.out.println("A " + shape + " has been created with length: " + n1);
    }

    public void area() {
        System.out.println("The area of the " + shape + " is: " + area);
    }

    public Shape2D(int n1, int n2) {
        this.n1 = n1;
        shape = "Rectangle";
        area = n1 * n2;
        System.out.println("A " + shape + " has been created with length: " + n1 + " and breadth: " + n2);
    }

    public Shape2D(int n1, int n2, String shape) {
        this.n1 = n1;
        this.shape = shape;
        area = 0.5 * n1 * n2;
        System.out.println("A " + shape + " has been created with height: " + n1 + " and base: " + n2);
    }

    public Shape2D(int n1, int n2, int n3) {
        this.n1 = n1;
        shape = "Triangle";
        int s = (n1 + n2 + n3) / 2;
        int a = s * (s - n1) * (s - n2) * (s - n3);
        area = Math.pow(a, 0.5);
        System.out.println("A " + shape + " has been created with the following sides: " + n1 + "," + n2 + "," + n3);
    }

}
