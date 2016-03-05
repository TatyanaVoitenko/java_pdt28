package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Tanchik on 05.03.2016.
 */
public class PointTests {
  @Test
  public void testDistance(){
    Point p1 = new Point(0, 0);
    Point p2 = new Point(5, 5);
    Assert.assertEquals(p1.distance(p2), 7.0710678118654755);
  }

  @Test
  public void testDistance1(){
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 0);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }
  @Test
  public void testDistance2(){
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 1);
    Assert.assertEquals(p1.distance(p2), 1.0);
  }
  @Test
  public void testDistance3(){
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, -2);
    Assert.assertEquals(p1.distance(p2), 2.0);
  }
}
