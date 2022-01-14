package array;
import java.util.ArrayList;
import java.util.Arrays;

public class pract {
    public static void main(String[] args) {
        int nums[]={8,4,3,5};
        int sum=0;
        for(int k=0;k<nums.length;k+=2){
            sum+=nums[k];
        }
        System.out.println(sum);
    }
}
