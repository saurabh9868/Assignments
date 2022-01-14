package array;

public class twoArraySum {
    public static void main(String[] args) {

            int arr[]={1,2,3,4,5};

            int sec_max=Integer.MIN_VALUE;
        int max=sec_max+1;
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    sec_max=max;
                    max=arr[i];
                }
            }

    }
}