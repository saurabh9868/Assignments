package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class create_new_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=4;
        int N=5;
        int arr[][]=new int[M][N];
        System.out.println("start filling the 2d array");
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                int val= sc.nextInt();
                if (val%2==0){
                    arr[i][j]=val;
                }

            }
        }
        System.out.println("your 2d array is");
        for(int i=0;i<M;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
