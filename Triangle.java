public class Triangle{
  private Point vertex1;
  private Point vertex2;
  private Point vertex3;

  public Triangle(Point first, Point second, Point third){
    vertex1 = new Point(first);
    vertex2 = new Point(second);
    vertex3 = new Point(third);
  }

  public Triangle(double firstX, double firstY, double secondX, double secondY, double thirdX, double thirdY){
    vertex1 = new Point(firstX, firstY);
    vertex2 = new Point(secondX, secondY);
    vertex3 = new Point(thirdX, thirdY);
  }

  public String toString(){
    return "[" + vertex1 + "," + vertex2 + "," + vertex3 + "]";
  }

  public Point[] getVertices(){
    return new Point[] {vertex1, vertex2, vertex3};
  }
  public double calculatePerimeter(){
    double SegmentAB = vertex1.distanceTo(vertex2);
    double SegmentAC = vertex1.distanceTo(vertex3);
    double SegmentBC = vertex2.distanceTo(vertex3);
    return SegmentAB + SegmentAC + SegmentBC;
  }
}
