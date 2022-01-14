package array;

public class Sum_of_min_and_max_element_of_k_size_sub_array {
    public static int sum_of_sub_min_max(int arr[],int k){
        int arr2[]=new int[k];
        int sum=0;
        for(int i=0;i<arr.length-(k-1);i++){
            for(int j=i,l=0;j<i+k && l<arr2.length;j++,l++){
                arr2[l]=arr[j];
            }
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int d=0;d<k;d++){
                    if(min>arr2[d]){
                        min=arr2[d];
                    }
                    if(max<arr[d]){
                        max=arr[d];
                    }
                }
                sum+=(min+max);

            }
         return sum;
        }

    public static void main(String[] args) {
        int arr[] = {2, 5, -1, 7, -3, -1, -2};
        int k=4;
        System.out.println(sum_of_sub_min_max(arr,k));
    }
}
