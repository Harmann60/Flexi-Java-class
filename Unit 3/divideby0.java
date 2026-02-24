public class divideby0
{
    public static void main(String args[])
    {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int ans = num1 / num2;
            System.out.println("Answer" + ans);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
    }
    }
}
