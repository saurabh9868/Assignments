package array;

import java.util.Arrays;

public class merge_two_sort_array {
    public static void main(String[] args) {
        int num[]={2,3,14,25,26};
        int num2[]={4,9,18,21};
        int n=num.length;
        int m=num2.length;
        int i=0;
        int j=0;
        int k=n-1;
        while(i<=k && j<m){
            if(num[i]<num2[j]){
                i++;
            }
            else if(num2[j]<num[i]){
                int temp=num2[j];
                num2[j]=num[k];
                num[k]=temp;
                k--;
                j++;
            }
        }
        Arrays.sort(num);
        Arrays.sort(num2);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
    }
}
