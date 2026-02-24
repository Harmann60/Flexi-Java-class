public class Stringd
{
    public static void main(String[] args)
    {
        String str1="Hello";
        String str2="bye";
        if(str1.compareTo(str2)<0)
            System.out.println(str2+" is bigger");
        else if(str1.compareTo(str2)>0)
            System.out.println(str1+" is bigger");
        else
            System.out.println("Equal string");
    }
}
