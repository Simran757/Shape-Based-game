public class Rombus extends TwoDShape {
    double side;
    double diagonal1;
    double diagonal2;

    Rombus() {

    }

    Rombus(double side, double diagonal1, double diagonal2) {
        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public void getArea() {
        System.out.println("Area of Rhombus is : " + (1 / 2) * diagonal1 * diagonal2);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of Rhombus is : " + 4 * side);
    }
}
