public class Parallelogram extends TwoDShape {
    double height;
    double base;

    Parallelogram() {

    }

    Parallelogram(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public void getArea() {
        System.out.println("Area of Parallelogram is : " + base * height);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of Parallelogram is : " + 2 * base + 2 * height);
    }
}
