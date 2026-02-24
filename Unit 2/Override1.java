package Class;

public static class spur {
    private int num1;
    private int num2;
    private int num3;
    int add(int num1,int num2)
    {
        return num1+num2;
    }
    int add(int num)
    {
        return num+num;
    }
    void add(int num1,int num2,int num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        System.out.println(this.num1);
    }
}
public void main(String[] args)
{
    spur old = new spur();
    System.out.println(old.add(10));
    System.out.println(old.add(20,10));
    old.add(10,20,30);
}
