interface Resizable{
    public void resize(double factor);
}
abstract class Shape{
    public String name;
    Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
}

class Circle extends Shape implements Resizable{
    public double radius;
    Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public double calculateArea() {
        return 3.14*radius*radius;
    }
    @Override
    public void resize(double factor) {
        radius*=factor;
    }
}

class Rectangle extends Shape{
    public double width,height;
    Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        return height*width;
    }
}

public class Main{
    public static void main(String[] args){
        Shape c1 = new Circle("Circle",5);
        Shape r1 = new Rectangle("Rectangle", 3,5);
        System.out.println(c1.calculateArea());
        System.out.println(r1.calculateArea());

        Circle c2 = new Circle("circle",5);
        c2.resize(2.0);
        System.out.println(c2.calculateArea());
    }
}