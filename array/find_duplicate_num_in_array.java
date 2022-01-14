package array;

import java.util.Arrays;

public class find_duplicate_num_in_array {
    public static void main(String[] args) {
        int nums[]={1,2,3,9,5,6,4,9,8};
        int count;
        int value=-1;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>1){
                value=i;
                break;
            }
        }
        System.out.println(nums[value]);
    }
}
