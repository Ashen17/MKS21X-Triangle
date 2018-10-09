public class Point{
  private double xValue;
  private double yValue;

  public Point(double x, double y){
    xValue = x;
    yValue = y;
  }

  public Point(){
    xValue = 0;
    yValue = 0;
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
}
