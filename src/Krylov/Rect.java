package Krylov;

public class Rect extends Shape {
    private int a, b;

    public Rect(int x, int y, int a, int b) {
        super(x,y);
        this.a = a;
        this.b = b;
    }

    public Rect(int a, int b) {
        this (0, 0, a, b);
    }

    public void area() {
        System.out.println("Area rectangle = " + a * b);
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Area rectangle = " + a * b);
    }
}
