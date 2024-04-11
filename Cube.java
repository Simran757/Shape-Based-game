public class Cube extends ThreeDShape {
    double side;

    Cube() {

    }

    Cube(double side) {
        this.side = side;
    }

    @Override
    public void getVolume() {
        System.out.println("Volume of Cube is : " + side * side * side);
    }

    @Override
    public void getTotalSurfaceArea() {
        System.out.println("Lateral Surface area of Cube is : " + 4 * side * side);
    }

    @Override
    public void lateralsSurfaceArea() {
        System.out.println("Total surface area of Cube is : " + 6 * side * side);
    }
}
