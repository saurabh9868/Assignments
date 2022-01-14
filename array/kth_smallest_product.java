package array;

public class kth_smallest_product {
    public static void main(String[] args) {
        int num1[]={1,2,3,4,5};
        int num2[]={5,6,7,89,7};
        int k=0;///kth element
        int kthElement=0;
        int i=0;
        int j=0;
        int count =0;
        while(count <=k){
            if(num1[i]>0 && num2[j]>0){
                kthElement=num1[i]*num2[j];
                j++;
            }

        }
    }
}
