package mama;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointDis {

  @Test
  public void testDistPositive (){
    Point a = new Point(0,0);
    Point b = new Point(3,4);

    Assert.assertEquals(Point.dist(a,b), 5.0);
  }

  @Test
  public void testDistZero (){
    Point a = new Point(0,0);
    Point b = new Point(0,0);

    Assert.assertEquals(Point.dist(a,b), 0);
  }

  @Test
  public void testDistWithMinus (){
    Point a = new Point(0,0);
    Point b = new Point(-3,-4);

    Assert.assertEquals(Point.dist(a,b), 5);
  }
}
