package array;

public class find_contigous_array_sum_is_max {
    public static int max(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
      int arr[]={-1,3,-2,2,3,4,5,-1,5,9,};
        System.out.println(max(arr));
    }
}
