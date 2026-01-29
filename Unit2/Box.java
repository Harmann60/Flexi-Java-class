public class Box
  {
    private double length;
    private double height;
    private double weidth;th
    Box()
    {
      this.height =-1;
      this.length=-1;
      this.width=-1;
  }
    Box(double length,double height,double width)
    {
      this.height=height;
        this.length=length;
      this.width=width;
    }
    Box(Box b)
    {
      this.width=b.width;
      this.height=b.height;
      this.length=b.length;
    }
    Box(double side)
    {
      this.height=side;
      this.length=side;
      this.width=side;
    }
    public double getWidth()
    {
      return width;
    }
    public double getHeight()
    {
      return height;
    }
    public double getLength()
    {
      return length;
    }
    public void setHeight(double height)
    {
      this.height=height;
    }
    public void setWidth
    {
      this.width=width;
    }
    public void setLength
    {
      this.length=length;
        }
    
 
