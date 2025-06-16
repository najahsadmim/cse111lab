
public class Circle extends Shape {

    public double area;
    public int radius;

    public Circle() {
        super();
    }

    public void area() {
        area = Math.PI * radius * radius;
        System.out.println("Area of " + color + " Circle: " + area);
    }
}
