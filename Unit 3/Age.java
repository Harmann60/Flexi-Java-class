import java.util.InputMismatchException;

public class Age

{
    private int age;
    Age()
    {
        this.age = -1;
    }
    Age(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    void Agecheck()
    {
        if(this.age<18)
            throw new InputMismatchException();
        System.out.println("You are eligible to do many things that you were doing illegally");
    }
}
