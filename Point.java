public class Point{
  private double x, y;

  public Point(double newX, double newY){
    x = newX;
    y = newY;
  }

  public Point(){
    x = 0;
    y = 0;
  }

  public Point(Point p){
    xValue = p.xValue;
    yValue = p.yValue;
  }

  public double getX(){
    return xValue;
  }
  public double getY(){
    return yValue;
  }

  public String toString(){
    return "[" + xValue + " , " + yValue + "]";
  }

  public double distanceTo(Point p){
    //return 2.3;
    return Math.sqrt((Math.pow((this.xValue - p.xValue), 2)) + (Math.pow((this.yValue - p.yValue), 2)));
  }
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.x-b.x), 2) + Math.pow((a.y - b.y), 2));
  }
}
