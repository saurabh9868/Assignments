package array;

import java.util.Scanner;

public class some_work_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0, j=n-1;i<j;i++,j--){
            int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
        }
        for(int j=0;j< arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
