package array;

import java.util.Arrays;

public class negative_one_side {
    public static void main(String[] args) {
        int num[]={1,2,-4,5,-5,-6,-3,5,4,-4,457,-7,3,2};
        int j=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>0 && num[j]<0){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
            if(num[j]>0){
                j++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
