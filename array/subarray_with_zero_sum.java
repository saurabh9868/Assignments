package array;

public class subarray_with_zero_sum {
    public static void main(String[] args) {
        int arr[]={4 ,2, -3,2, 12, 6};
        int n=arr.length;
        boolean zero=false;
        int sum=0;
        for(int i=0;i<n-1;i++) {
            sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum = sum + arr[j];
                if (sum == 0) {
                    zero = true;
                }
            }
        }
        System.out.println(zero);
    }
}
