package unit2;

public class Triangle extends Diagram
  {
    Triangle()
    {
       private double Length;
       private double Height;
    }
    void displayValues()
    {
      System.out.println("height is - " +getHeight());
      System.out.println("length is - " +getLength());
    }
    void calc_Area()
    {
      return (0.5*getHeight*getLength);
    }
    
    
    
    
