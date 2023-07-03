import Krylov.Circle;
import Krylov.Rect;
import Krylov.Shape;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(8, 8, 7);
        circle.move(5,5);
        circle.Print();
    }
}