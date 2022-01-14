package matrix;

import java.util.Arrays;

public class traversel_of_a_matrix_column_wise {
    public static void main(String[] args) {
        int num[][] ={{10,20,30,40},{15,25,35,45},{27,29,37,48}};
        int num2[][]=new int[num[0].length][num.length];
        for(int i=0;i<num2.length;i++){
            for(int j=0;j<num2[0].length;j++){
                num2[i][j]=num[j][i];
            }
        }
        for(int i=0;i< num2.length;i++){
            System.out.println(Arrays.toString(num2[i]));
        }
    }
}
