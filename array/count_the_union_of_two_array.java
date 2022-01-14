package array;

public class count_the_union_of_two_array {
    public static void main(String[] args) {
        int arr1[]={2,4,5,9,10,56,67};
        int arr2[]={4,5,11,12};
        int count=0;
        int n=arr2.length;
        int m=arr1.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
                count++;
            }
            else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j++] + " ");
                count++;
            }
            else {
                System.out.print(arr2[j++] + " ");
                i++;
                count++;
            }
        }

        /* Print remaining elements of
         the larger array */
        while (i < m) {
            System.out.print(arr1[i++] + " ");
            count++;
        }
        while (j < n) {
            System.out.print(arr2[j++] + " ");
            count++;
        }
        System.out.println();
        System.out.println(count);
    }
}
