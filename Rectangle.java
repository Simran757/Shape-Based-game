public class Rectangle extends TwoDShape {
    double length;
    double width;

    Rectangle() {

    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println("Area of Rectangle is : " + width * length);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of Rectangle is : " + 2 * (width + length));
    }

}
