import colors.Color;
import shapes.Circle;
import shapes.Point;

public class Main {
    public static void main(String[] args) {
        checkCircle();
    }

    static void checkCircle() {
        // центр круга
        Point point = new Point(2, 1);
        // круг с центром point и радиусом 1
        Circle circle = new Circle(point, 1);
        // отображение данных о круге
        circle.draw();

        //замена цвета круга с дефолтного TRANSPARENT на RED
        circle.setColor(Color.RED);
        // изменение центра круга
        circle.setPoint(new Point(2, 2));
        // перемещение центра круга по оси OX и OY на единицу
        circle.move(1, 1);
        // отображение данных о круге
        circle.draw();

        Circle circleError = new Circle(point, 1);
        circleError.draw();

    }
}