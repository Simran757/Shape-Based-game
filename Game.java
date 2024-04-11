import java.util.Scanner;

public class Game {
    Game() {
        System.out.println("=====Game is Started !!=======\nWelcome to Game.");
    }

    Scanner sc = new Scanner(System.in);

    public int selectShape() {

        System.out.println("======================================");
        System.out.println("Enter 1 for 2d shape");
        System.out.println("Enter 2 for 3d shape");
        System.out.println("======================================");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("You have selected 2d shape");
            System.out.println("======================================");
            return x;

        } else if (x == 2) {
            System.out.println("You have selected 3d shape");
            System.out.println("======================================");
            return x;
        } else {
            System.out.println("this is not a valid choice");
            System.out.println("please select right option");
            return selectShape();
        }
    }

    public TwoDShape selectTwoDShape() {

        System.out.println("========================================");
        System.out.println("Press 1 for Circle..");
        System.out.println("Press 2 for Square..");
        System.out.println("Press 3 for Hexagone..");
        System.out.println("Press 4 for Parallelogram..");
        System.out.println("Press 5 for Rectangle..");
        System.out.println("Press 6 for Rombus..");
        System.out.println("Press 7 for Triangle..");
        System.out.println("========================================");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected Circle.");
                System.out.println("enter the radious: ");
                double r = sc.nextDouble();
                return new Circle(r);

            case 2:
                System.out.println("You have selected Sqaure");
                System.out.println("Enter the measurement of the side: ");
                double side = sc.nextDouble();
                return new Square(side);

            case 3:
                System.out.println("You have selected Hexagon");
                System.out.println("Enter the measurement of the side: ");
                double side1 = sc.nextDouble();
                return new Hexagon(side1);

            case 4:
                System.out.println("You have selected Parallelogram");
                System.out.println("Enter the measurement of the base : ");
                double base = sc.nextDouble();
                System.out.println("Enter the measurement of the height : ");
                double height = sc.nextDouble();
                return new Parallelogram(base, height);

            case 5:
                System.out.println("You have selected Rectangle");
                System.out.println("Enter the measurement of the length : ");
                double length = sc.nextDouble();
                System.out.println("Enter the measurement of the width : ");
                double width = sc.nextDouble();
                return new Rectangle(length, width);

            case 6:
                System.out.println("You have selected Rombus");
                System.out.println("Enter the measurement of the side : ");
                double side2 = sc.nextDouble();
                System.out.println("Enter the measurement of the diagonal1 : ");
                double diagonal1 = sc.nextDouble();
                System.out.println("Enter the measurement of the diagonal2 : ");
                double diagonal2 = sc.nextDouble();
                return new Rombus(side2, diagonal1, diagonal2);

            case 7:
                System.out.println("You have selected Triangle");
                System.out.println("Enter the measurement of the base : ");
                double base2 = sc.nextDouble();
                System.out.println("Enter the measurement of the height : ");
                double height2 = sc.nextDouble();
                System.out.println("Enter the measurement of the side1 : ");
                double side3 = sc.nextDouble();
                System.out.println("Enter the measurement of the side2 : ");
                double side4 = sc.nextDouble();
                System.out.println("Enter the measurement of the side3 : ");
                double side5 = sc.nextDouble();
                return new Triangle(base2, height2, side3, side4, side5);

            default:
                System.out.println("This is not the right choice. \nPlease select the right choice.");
                return selectTwoDShape();
        }

    }

    public ThreeDShape selectThreeDShape() {

        System.out.println("========================================");
        System.out.println("Press 1 for Cone..");
        System.out.println("Press 2 for Cube..");
        System.out.println("Press 3 for Cylinder..");
        System.out.println("Press 4 for Spher..");
        System.out.println("Press 5 for Cuboid..");
        System.out.println("========================================");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected Cone");
                System.out.println("Enter the length :");
                double l = sc.nextDouble();
                System.out.println("Enter the radius :");
                double r = sc.nextDouble();
                System.out.println("Enter the height :");
                double h = sc.nextDouble();
                return new Cone(l, r, h);
            case 2:
                System.out.println("You have selected Cube");
                System.out.println("Enter the measurment of side : ");
                double s = sc.nextDouble();
                return new Cube(s);
            case 3:
                System.out.println("You have selected Cuboid");
                System.out.println("Enter the height :");
                double h2 = sc.nextDouble();
                System.out.println("Enter the width :");
                double w2 = sc.nextDouble();
                System.out.println("Enter the length :");
                double l2 = sc.nextDouble();
                return new Cuboid(h2, w2, l2);
            case 4:
                System.out.println("You have selected Cylinder");
                System.out.println("Enter the height : ");
                double h3 = sc.nextDouble();
                System.out.println("Enter the radius : ");
                double r2 = sc.nextDouble();
                System.out.println("Enter the width : ");
                double w3 = sc.nextDouble();
                System.out.println("Enter the length : ");
                double l3 = sc.nextDouble();
                return new Cylinder(h3, r2, w3, l3);
            case 5:
                System.out.println("You have selected Sphere");

                return new Sphere();

            default:
                System.out.println("This is not the right choice. \nPlease select the right choice.");
                return selectThreeDShape();
        }

    }

}
