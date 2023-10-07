package shapes;

public class Circle extends Shape {

    private Point point = new Point();
    private double radius = 0.0;

    public Circle(Point point, double radius) {
            validate();
            this.point = point;
            this.radius = radius;
    }

    public Circle() {}

    public Point getPoint() {
        return this.point;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setRadius(double radius) throws Exception {
        this.radius = radius;
    }

    public void move(double moveX, double moveY) {
        validate();
        this.point = new Point(this.point.getX() + moveX, this.point.getY() + moveY);
    }

    @Override
    public double getPerimeter() {
        validate();
        return 2 * 3.14 * this.radius;
    }

    @Override
    public double getSquare() {
        validate();
        return 3.14 * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Фигура круг \nЦентр круга: (x = "
                        + point.getX()
                        + ", y = " + point.getY()
                        + ") \nРадиус круга: "
                        + this.radius
                        + "\nПлощадь круга: "
                        + getSquare()
                        + "\nПериметр круга: "
                        + getPerimeter()
                        + "\nЦвет круга: "
                        + getColor()
                        + "\n"
        );
    }

    private void validate() {
        if (this.radius < 0) {
            throw new RuntimeException("Не удалось создать круг");
        }
    }
}
