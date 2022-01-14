package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class create_identity_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<3;i++){
        System.out.println(Arrays.toString(arr[i]));
        }
    }
}
