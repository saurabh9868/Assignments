package stack;

public class find_the_largest_area_in_a_histogram {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,2,1,3,5};
        int max=0;
        for(int i=0;i< arr.length;i++){
            int left=i;
            int right=i;
            while(left>=0 && arr[left]>=arr[i]){
                left--;
            }
            while(right< arr.length && arr[right]>=arr[i]){
                right++;
            }
            int area=(right-left-1)*arr[i];
            if(area>max){
                max=area;
            }
        }
        System.out.println(max);
    }
}
