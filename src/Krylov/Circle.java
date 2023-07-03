package Krylov;


public class Circle extends Shape {
    private float radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    public Circle(int radius) {
        this(0,0, radius);
    }

    public float area(){
        return (float)(Math.PI*radius*radius);
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Площадь фигуры = " + String.format("%.2f", Math.PI*radius*radius));
    }
}
