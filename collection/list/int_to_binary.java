package collection.list;

import java.util.Arrays;
import java.util.Scanner;

public class int_to_binary {
    public static void reverse(int arr[] ,int start_index,int last_index) {
        int i = start_index;
        int j = last_index;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int arr[]=new int[a/2];
        int i=0;
        while(a>0){
            arr[i]=a%2;
            a=a/2;
            i++;
        }
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
