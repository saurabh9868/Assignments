package matrix;

import java.util.Arrays;

public class sum_of_diagonal {
    public static void main(String[] args) {
        int arr1[][] = {{4, 2, 5},
                {7, 4, 10},
                {9, 8, 5}};
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {
                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
}
