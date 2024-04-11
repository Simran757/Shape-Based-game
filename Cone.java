public class Cone extends ThreeDShape {
    double length;
    double radius;
    double height;

    Cone() {

    }

    Cone(double length, double radius, double height) {
        this.length = length;
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void getVolume() {
        System.out.println("Volume of the Cone is : " + 3.14 * radius * radius * height / 3);
    }

    @Override
    public void getTotalSurfaceArea() {
        System.out.println("Total surface area of Cone is : " + 3.14 * radius * length);
    }

    @Override
    public void lateralsSurfaceArea() {
        System.out.println("Total surface area pf Cone is : " + 3.14 * radius * (radius + length));
    }

}
