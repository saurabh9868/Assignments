package array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int arr1[]=new int[N];
        int arr2[]=new int[M];

        for(int i=0;i<N;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<N;j++){
            arr2[j]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=N-1;
        int j=M-1;
        while(i>=0 && j>=0){
            if(arr1[i]!=1 && arr2[j]!=1){
                arr1[i]=arr1[i]*arr2[j];
                i--;
                j--;
            }
            else if(arr1[i]==1 || arr2[j]==1){
                arr1[i]+=arr2[j];
                i--;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr1));
        int product=1;
        for(int k=0;k<N;k++){
             product*=arr1[k];
        }
        System.out.println(product);
    }
}