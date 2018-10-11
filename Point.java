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
    x = p.x;
    y = p.y;
  }

  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public String toString(){
    return "[" + x + " , " + y + "]";
  }

  public double distanceTo(Point p){
    //return 2.3;
    return Math.sqrt((Math.pow((this.x - p.x), 2)) + (Math.pow((this.y - p.y), 2)));
  }
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.x-b.x), 2) + Math.pow((a.y - b.y), 2));
  }
}
