public class Line
{
  private Point start;
  private Point end;
  
  public Line() 
  {
    start.setX(0);
    start.setY(0);
    end.setX(0);
    end.setY(0);
  }
  
  public Line(Point startPoint, Point endPoint) 
  {
    start=startPoint;
    end=endPoint;
  }
  
  public double length() 
  {
    return start.distance(end);
  }
  
  public double slope() 
  {
    return (start.getY()-end.getY())/(start.getX()-end.getX());
  }
  
  public String toString() 
  {
    return ("["+start.toString()+", "+end.toString()+"]");
  }
  
  public void translate (int dx, int dy) 
  {
    start.translate(dx, dy);
    end.translate(dx, dy);
  }
}
