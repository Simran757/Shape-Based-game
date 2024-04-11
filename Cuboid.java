public class Cuboid extends ThreeDShape {
    double height;
    double width;
    double length;

    Cuboid() {

    }

    Cuboid(double height, double width, double length) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    @Override
    public void getTotalSurfaceArea() {
        System.out.println(
                "Total surface area of Cuboid :  " + 2 * ((length * width) + width * height * length * height));
    }

    public void getVolume() {
        System.out.println("Volume of the Cuboid is : " + length * width * height);
    }

    public void leteralsSurfaceArea() {
        System.out.println("Lateral surface area of Cuboid is : " + 2 * height * (length + width));
    }
}
