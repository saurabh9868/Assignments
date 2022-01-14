package matrix;

public class print_sum_of_matrix {
    public static  boolean neg(int x){
        boolean flag=false;
        if(x<0){
            flag=true;
        }
        if(x>=0){
            flag=false;
        }
        return  flag;
    }
    public static  boolean pos(int x){
        boolean flag=false;
        if(x<0){
            flag=false;
        }
        if(x>=0){
            flag=true;
        }
        return  flag;
    }
    public static boolean is_prime(int x){
        boolean flag=true;
        for(int i=2;i<x;i++){
            if(x%i==0){
               flag=false;
            }
        }
        return  flag;
    }
    public static int sum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        return  sum;
    }
    public static void main(String[] args) {
        int arr[][]={{4,8,-3,-4},
                {5,6,7,8},
                {9,10,11,12}};
        int arr2[][]={{4,8,-3,-4},
                {5,6,7,8},
                {9,10,11,12}};
        System.out.println(sum(arr));
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               if(is_prime(arr[i][j])){
                   count++;
               }
            }
        }
        System.out.println(count+" total number of primes");
        int pos=0;
        int neg=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(pos(arr[i][j])){
                    pos++;
                }
                else{
                    neg++;
                }
            }
        }
        System.out.println("total number of positives "+pos);
        System.out.println("total number of negatives "+neg);

    }
}
