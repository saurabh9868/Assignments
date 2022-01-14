package array;

public class minimum_and_maximum_in_an_array {
    public static void main(String[] args) {
       int num[]={21,4,23,150,78,9,2,5,176};
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<num.length;i++){
           if(min>num[i]){
              min=num[i];
           }
           if(max<num[i]){
               max=num[i];
           }
       }
        System.out.println(min+"  "+max);
    }
}
