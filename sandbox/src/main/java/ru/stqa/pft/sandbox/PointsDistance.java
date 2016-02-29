package ru.stqa.pft.sandbox;

public class PointsDistance {
  public static void main(String[] args) {

    Point p1 = new Point(0, 0);
    Point p2 = new Point(5, 5);
    System.out.println("Расстояние между двумя точками = " + p1.distance(p2));
  }
}
