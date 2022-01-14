package array;

public class minimum_jump {
    public static int minJumps(int arr[], int n){
        // Your code here
        int count =0;
        int i=0;
        while(i<n-1){
            // if(i+=arr[i]>n-1){
            //     i=n-1;
            //   count++;
            //}
            //else{
            i+=arr[i];
            count++;
            // }
        }
        return count;
    }
    public static void main(String[] args) {
        int num[]= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
        System.out.println(minJumps(num,11));
    }
}
