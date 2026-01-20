
public class Static
{
   static int i =10; //Static Variable
   int num1 = 40; //Instance variable or class variable
   static
   {
       System.out.println("Hello Class!!");
       i*=2 ;
   }
  public static void main(String[] args)
    {
        int j = 20;
        Static st = new Static();
        System.out.println("i = " +i);
        System.out.println("j = " +j );
        System.out.println("num1 = " +st.num1);
    }
}


/*Output
  Hello Class!!
i = 20
j = 20
num1 = 40
  */
