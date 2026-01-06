//Input using Scanner 
import java.util.*;
class AddNum
{
     public static void main(String args[])
     {
       System.out.println("Enter 2 Nos.");
       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int ans = num1 + num2;
       System.out.println("Additon is " +ans);
      } 
}
