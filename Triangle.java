public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point first, Point second, Point third){
    v1 = new Point(first);
    v2 = new Point(second);
    v3 = new Point(third);
  }

  public Triangle(double firstX, double firstY, double secondX, double secondY, double thirdX, double thirdY){
    v1 = new Point(firstX, firstY);
    v2 = new Point(secondX, secondY);
    v3 = new Point(thirdX, thirdY);
  }

  public String toString(){
    return "[" + v1 + "," + v2 + "," + v3 + "]";
  }

  public Point[] getVertices(){
    return new Point[] {v1, v2, v3};
  }
  public Point getVertex(int selected){
    return this.getvertices()[selected];
  }
  public double getPerimeter(){
    double SegmentAB = v1.distanceTo(v2);
    double SegmentAC = v1.distanceTo(v3);
    double SegmentBC = v2.distanceTo(v3);
    return SegmentAB + SegmentAC + SegmentBC;
  }
}
