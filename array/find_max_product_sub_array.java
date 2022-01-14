package array;

public class find_max_product_sub_array {
    public static void main(String[] args) {
        int arr[]={6, -3, -10, 0, 2};
        int result = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++)
            {
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            result = Math.max(result, mul);
        }
        System.out.println(result);
    }
}
