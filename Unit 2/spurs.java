class Club
{
void say()
{
    System.out.println("I play for Spurs");
}
}

class Player extends Club
{
    void say()
    {
        System.out.println("My name is son");
    }
}

public class spurs
{
    public static void main(String[] args)
    {
        Club s;
        s = new Player();
        s.say();
    }
}

