package array;

import java.util.Arrays;

public class max_contigous_sub_array {
    public static void main(String[] args) {
        int a[]={1,9,3,10,4,20,2};
        Arrays.sort(a);
        int count=1;
        for(int i=0;i<a.length-1;i++){
            int val=1;
            int j=i;
            while( j<a.length-1 && a[j+1]==a[j]+1){
                val++;
                j++;
            }
            count=Math.max(count,val);
        }
        System.out.println(count);
    }
}
