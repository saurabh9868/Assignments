package matrix;

import java.util.Arrays;

public class traverse_of_matrix {
    public static void main(String[] args) {
        int arr1[][] = {{4, 12, 12},
                        {2, 4, 10},
                        {5, 7, 15}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=arr1[j][i];
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
}
