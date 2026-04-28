import java.util.Scanner;
class Shape {
    void area() {
        System.out.println("Area method in Shape class");
    }
}
class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    void area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }
    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s;
        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();
        s = new Rectangle(l, b);
        s.area();
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        s = new Circle(r);
        s.area();
        sc.close();
    }
}