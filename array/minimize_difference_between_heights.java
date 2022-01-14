package array;

import java.util.Arrays;

public class minimize_difference_between_heights {
    public static void main(String[] args) {
        int k=3;
        int arr[]={2,3,4,57,56,6,7,9,12,5,34};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        int min=arr[0];
        int max=arr[arr.length-1];
        if(max-min<k){
            for(int i=0;i<arr.length;i++){
                arr[i]+=k;
            }
            System.out.println(max-min);
        }
        int new_min=min+k;
        int new_max=max-k;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<new_min){
                arr[j]+=k;
            }
            else if(arr[j]>new_max){
                arr[j]-=k;
            }
            else if((arr[j]-new_min)>(new_max-arr[j])){
                arr[j]-=k;
            }
            else{
                arr[j]+=k;
            }
            new_max=Math.max(arr[j],new_max);
            new_min=Math.min(arr[j],new_min);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(new_max-new_min);


        }
       // System.out.println(Arrays.toString(arr));
    }

