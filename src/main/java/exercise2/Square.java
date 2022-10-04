package exercise2;

/**
 *
 * @author Ananta D
 */
public class Square extends Rectangle {
    public Square(double side) { 
        super(side, side); // Call superclass Rectangle(double, double)
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    @Override
    public String toString() {
        return "A Square with side = " + getWidth() + ", which is a subclass of "
                + super.toString();
    }
}
