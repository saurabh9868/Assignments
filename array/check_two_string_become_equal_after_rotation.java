package array;

import java.util.Arrays;

public class check_two_string_become_equal_after_rotation {
    public static void reverse(char arr[],int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        String str="bhsaura";
        String str2="saurabh";

        boolean flag=false;
        if(str.length()!=str2.length()){
            flag=false;
        }

        char arr2[]=str2.toCharArray();
        for(int k=0;k<arr2.length-1;k++){
            reverse(arr2,0,arr2.length-1-k);
            reverse(arr2,arr2.length-k,arr2.length-1);
            reverse(arr2,0,arr2.length-1);
            System.out.println(Arrays.toString(arr2));
            }

        System.out.println(flag);
    }
}
