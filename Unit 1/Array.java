
import java.util.Scanner;
public class Array {
    public static void main(String args[]) {
        System.out.println("Enter 5 marks");
        Scanner sc = new Scanner(System.in);
        double avg;
        int total = 0;
        int arr1[] = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            total += arr1[i];
        }
        avg = total / arr1.length;
        System.out.println("Average is " + avg);
    }
}

//Output
/*
Enter 5 marks
67
54
68
65
23
Average is 55.0
  */
