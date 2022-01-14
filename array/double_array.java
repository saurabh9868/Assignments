package array;

import java.util.Arrays;
import java.util.Scanner;

public class double_array {
    public static int [] two_time(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("enter the size of array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(Arrays.toString(two_time(arr)));
            System.out.println("if wanna again press 1");
            ch=sc.nextInt();
        }while(ch==1);


    }
}
