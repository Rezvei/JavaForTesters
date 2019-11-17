package mama;

public class Point {

    public int a;
    public int b;

    public Point (int a, int b){
        this.a=a;
        this.b=b;
    }

    public static double dist(Point a, Point y) {
        return (Math.sqrt((a.a-y.a)*(a.a-y.a)+(a.b-y.b)*(a.b-y.b)));
    }
}
