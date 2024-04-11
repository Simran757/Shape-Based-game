public class Cylinder extends ThreeDShape {
    double height;
    double radius;
    double length;
    double width;

    Cylinder() {

    }

    Cylinder(double height, double radius, double length, double width) {
        this.height = height;
        this.radius = radius;
        this.length = length;
        this.width = width;
    }

    @Override
    public void getVolume() {
        System.out.println("voulme of Cylinder is : " + 3.14 * radius * radius * height);
    }

    @Override
    public void getTotalSurfaceArea() {
        System.out.println("Total surface area is : " + 2 * 3.14 * radius * (radius + height));
    }

    @Override
    public void lateralsSurfaceArea() {
        System.out
                .println("Lateral surface area is : " + 2 * ((length * width) + (width * height) + (height * length)));
    }
}
