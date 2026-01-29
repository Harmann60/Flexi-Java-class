package unit2;
public class ShipmentCost extends Box
  {
    private double cost;
    ShipmentCost()
    {
      super();
      this.cost=-1;
    }
    ShipmentCost(double length,double height,double width,double cost)
    {
      super(length,height,width);
      this.cost = cost;
    }
    ShipmentCost(ShipmentCost sc)
    {
      super(sc);
      this.cost=sc.cost;
    }
    public double getCost()
    {
      return cost;
    }
    public void setCost(double cost)
    {
      this.cost = cost;
    }
    double calcShipCost()
    {
      return this.volume()*this.cost;
    }
      
