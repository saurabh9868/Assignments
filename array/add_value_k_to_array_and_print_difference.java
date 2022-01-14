package array;

import java.util.Arrays;

public class add_value_k_to_array_and_print_difference {
    public static void main(String[] args) {
        int a[]={2,3,4,9,45,4};
        int k=3;

        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(a[j]<a[j-1]){
                   int temp=a[j];
                   a[j]=a[j-1];
                   a[j-1]=temp;
                }
            }
        }
        int min=a[0];
        int max=a[n-1];
        if(max-min<k){
            for(int i=0;i<n;i++){
                a[i]+=k;
            }
            System.out.println(max-min);
        }

        //System.out.println(min +" "+ max);
        //System.out.println(max-min);
    }
}
