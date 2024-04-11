public class Triangle extends TwoDShape {
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    Triangle() {

    }

    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void getArea() {
        System.out.println("Area of Triangle is :  " + (1 / 2) * base * height);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of Triangle is : " + side1 + side2 + side3);
    }
}
