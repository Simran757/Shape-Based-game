public class Sphere extends ThreeDShape {
    double radious;

    Sphere() {

    }

    Sphere(double radious) {
        this.radious = radious;
    }

    @Override
    public void getVolume() {
        System.out.println("Volume of Sphere is : " + (4 / 3) * 3.14 * radious * radious * radious);
    }

    @Override
    public void getTotalSurfaceArea() {
        System.out.println("Total surface area of Sphere is : " + 4 * 3.14 * radious * radious);
    }

    @Override
    public void lateralsSurfaceArea() {
        System.out.println("Letral surface of Sphere is : " + 4 * 3.14 * radious * radious);
    }

}
