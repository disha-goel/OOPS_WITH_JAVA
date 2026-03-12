//24BCS10773

class Area {
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}
public class Main {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.area(5);          
        obj.area(10, 4);      
    }
}
