package array;

import java.util.Arrays;

public class median_of_two_sorted_array {
    public static void main(String[] args) {
        int arr1[]={3,5,7,18,21,45};
        int arr2[]={3,6,15,34,35,67};
        int n= arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        int k=n-1;
        while(i<=k && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                int temp=arr2[j];
                arr2[j]=arr1[k];
                arr1[k]=temp;
                k--;
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int median=(arr1[arr1.length-1]+arr2[0])/2;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(median);
    }
}
