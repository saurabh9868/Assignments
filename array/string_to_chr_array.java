package array;

import java.util.Arrays;
import java.util.Scanner;

public class string_to_chr_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string you want to convert character array");
        String a= sc.nextLine();
        int n=a.length();
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=a.charAt(i);
       }
        System.out.println("second string");
        String b= sc.nextLine();
        System.out.println(Arrays.toString(b.toCharArray()));
        System.out.println(Arrays.toString(arr));
    }
}
