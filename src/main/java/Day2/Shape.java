package Day2;

public class Shape {
    int getArea(){
        return 0;
    }
}
class Rectangle extends Shape{
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea(){
        return this.length * this.breadth;
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 6);
        System.out.println(r1.getArea());
    }
}
