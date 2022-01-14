package matrix;

import java.util.Arrays;

public class multiplication_of_matrix {
    public static void main(String[] args) {
        int arr1[][] = {{4, 2, 5},
                {7, 4, 10},
                {9, 8, 5}};
        int arr2[][] = {{4, 2, 5},
                {7, 4, 10},
                {9, 8, 5}};
        int arr3[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}
