public class Rectangle 
{ 
  Point origin; 
  int width; 
  int height; 
  public Rectangle() { 
    origin=new Point();
    width=0; 
    height=0; 
  } 
  public Rectangle(Point bottomLeft, Point topRight) 
  { 
    origin=bottomLeft; 
    width=topRight.getX()-bottomLeft.getX(); 
    height=topRight.getY()-bottomLeft.getY(); 
  } 
  public Rectangle(Point bottomLeft, int a, int b) 
  { 
    origin=bottomLeft; 
    width=a-bottomLeft.x; 
    height=b-bottomLeft.y; 
  } 
  public Point getBottomLeft()
  { 
    return origin; 
  } 
  public Point getTopRight()
  { 
    Point o=origin; 
    o.setX(o.getX()+width); 
    o.setY(o.getY()+height); 
    return o; 
  } 
  public int getHeight()
  { 
    return height; 
  } 
  public int getWidth() 
  { 
    return width; 
  } 
  public double area() 
  { 
    return width*height; 
  } 
  public double diagonal() 
  { 
    return Math.sqrt(height*height+width*width); 
  } 
  public int perimeter() 
  { 
    return 2*(height+width); 
  } 
  public boolean isSquare() 
  { 
    if(height==width) 
    { 
      return true; 
    } 
    else 
    { 
      return false; 
    } 
  } 
  public String toString() 
  { 
    return "["+origin.toString()+", "+getTopRight().toString()+"]"; 
  } 
  public void translate (int dx, int dy)
  { 
    origin.translate(dx, dy); 
  } 
  public void scale (int dx, int dy) 
  { 
    width+=dx; 
    height+=dy; 
  } 
} 
