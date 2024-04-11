public class Hexagon extends TwoDShape {
    double side;

    Hexagon() {

    }

    Hexagon(double side) {

    }

    @Override
    public void getArea() {
        System.out.println("Area of Hexagon : " + (3 * (1 / 3 * 3) * side * side) / 2);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of Hexagon : " + 6 * side);
    }
}
