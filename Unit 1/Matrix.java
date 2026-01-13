import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in 3 X 3 Matrix");
        int arr[][] = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
         }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//Outpur
/*
Enter values in 3 X 3 Matrix
1
2
3
4
5
6
7
8
9
1 2 3 
4 5 6 
7 8 9 
*/
