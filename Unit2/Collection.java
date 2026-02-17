import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Collection
public class Collection
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        LinkedList<String> link = new LinkedList<String>();
        List<String> dept = new ArrayList<>();
        dept = new LinkedList<>();
        names.add("First");
        names.add("Second");
        names.add("Fourth");
        names.add(2,"Third");
        System.out.println(names);
    }
}
