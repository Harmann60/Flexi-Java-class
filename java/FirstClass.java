//First Java program

class FirstClass
{
   public static void main(String[] args)
  {
    System.out.println("Hello World!");
    System.out.println("Hello " + args[0]);
    int num1 = Integer.parseInt(args[1]);
    int num2 = Integer.parseInt(args[2]);
    int ans = num1 + num2;
    System.out.println("Addition is " +ans);
   }
}
