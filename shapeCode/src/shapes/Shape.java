package shapes;

import colors.Color;

public abstract class Shape {
    public Color color = Color.TRANSPARENT;
    public double getPerimeter() {
        return 0.0;
    }

    public double getSquare() {
        return 0.0;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw() {}

}
