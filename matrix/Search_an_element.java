package matrix;

import java.util.Scanner;

public class Search_an_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row");
        int m = sc.nextInt();
        System.out.println("enter the size of column");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("start filling the array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }
       // System.out.println("enter the element you want to search");
        //int target= sc.nextInt();
       // boolean is_present=false;
        int sum=0;
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                int val = arr[i][j];
               sum+=val;
            }
           // System.out.println();
        }
            System.out.println(sum);
    }
}
