package exercise2;

/**
 *
 * @author Ananta D
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Circle circle = new Circle(14, "Cyan", false);
        System.out.println(circle.toString());
        
        Rectangle rectangle = new Rectangle(8, 16);
        System.out.println(rectangle.toString());
        
        Square square = new Square(15);
        System.out.println(square.toString());
    }
}
