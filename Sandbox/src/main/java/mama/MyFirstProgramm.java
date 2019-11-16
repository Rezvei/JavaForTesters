package mama;

public class MyFirstProgramm {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Point a = new Point (2,3);
        Point b = new Point (4,6);

        dist(a,b);
        }

    public static void dist(Point a, Point y) {
        System.out.println(Math.sqrt((a.a-y.a)*(a.a-y.a)+(a.b-y.b)*(a.b-y.b)));
    }
   }
