package Krylov;

public class Shape {
    private int x, y;

    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape move(int dx, int dy){
        x += dx;
        y += dy;
        return this;
    }

    public void Print(){
        System.out.println("Координаты фигуры - x = " + x + " y = " + y);
    }
}
