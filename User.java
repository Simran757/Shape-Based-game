import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Game g = new Game();
        char c;
        do {
            int choice = g.selectShape();
            switch (choice) {
                case 1:
                    TwoDShape t1 = g.selectTwoDShape();
                    t1.getArea();
                    t1.getPerimeter();
                    break;
                case 2:
                    ThreeDShape t2 = g.selectThreeDShape();
                    t2.getTotalSurfaceArea();
                    t2.lateralsSurfaceArea();
                    t2.getVolume();
                    break;
            }
            System.out.println("Press c/C to continue. Or other character to exit");
            Scanner sc = new Scanner(System.in);
            c = sc.next().charAt(0);

        } while (c == 'c' || c == 'C');

        System.out.println("Thank you for playing the game ...\nHave a Good Day!!");
    }
}
