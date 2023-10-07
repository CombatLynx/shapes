package shapes;

public class Point extends Shape {
    private double x;
    private double y;

    Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    void move() {
//        super.move();
//    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}