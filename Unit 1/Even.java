//Add even numbers of an array
import java.util.Scanner;
public class even
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i =0;i<10;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int i =0;i<10;i++)
        {
            if(arr[i]%2==0)
                sum+=arr[i];
        }
        System.out.println("Sum " +sum);
    }
}


/*Output
  1
2
3
4
5
6
7
8
9
10
Sum 30
  */
