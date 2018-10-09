public class Driver{
  public static void main(String[] args){
    Point positive = new Point(4.0, 6.3);
    Point positive2 = new Point(5.0, 9.0);
    Point positive3 = new Point(2.3, 11.0);

    Triangle test  = new Triangle(positive, positive2, positive3);
    Triangle sixTest = new Triangle(4.0, 6.3, 5.0, 9.0, 2.3, 11.0);
    System.out.println(test);
    System.out.println(sixTest);
    System.out.println(positive.getX() - positive2.getY());

    System.out.println(test.getVertices()[2]);
    System.out.println(calculatePerimeter(test));
    System.out.println(test.calculatePerimeter());

  }
  public static double calculatePerimeter(Triangle t){
    Point[] Vertices = t.getVertices();
    double SegmentAB = Vertices[0].distanceTo(Vertices[1]);
    double SegmentAC = Vertices[0].distanceTo(Vertices[2]);
    double SegmentBC = Vertices[1].distanceTo(Vertices[2]);
    return SegmentAB + SegmentAC + SegmentBC;
  }



}
