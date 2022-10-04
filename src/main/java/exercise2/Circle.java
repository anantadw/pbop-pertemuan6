package exercise2;

/**
 *
 * @author Ananta D
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        radius = 1.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public double getPerimiter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius + ", which is a subclass of " 
                + super.toString();
    }
}
