public class garbage {
    String label;
    garbage()
    {
        this.label="Defualt";
    }
    garbage(String l)
    {
        this.label=l;
    }
    void display()
    {
        System.out.println("Display method "+label);
    }
    public static void main(String[] args)
    {
        garbage gd1 = new garbage();
        gd1.display();
        gd1=null;
        garbage gd2 = new garbage("object 2");
        gd2.display();
        new garbage("object 3").display();
    }
}
