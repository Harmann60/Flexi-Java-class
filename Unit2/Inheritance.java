package unit2;
public class Inheritance
  {
    public static void main(String[] args)
    {
      ShipmentCost c1=new ShipmentCost();
      ShipmentCost c2=new ShipmentCost(1,2,3,4);
      ShipmentCost c3=new ShipmentCost(c2);
      ShipmentCost c4=new ShipmentCost();
      System.out.println("Volume is :" +c2.volume());
      Systemout.println("Total Shipping Cost is :" +c2.cal,cShipCost());
    }
