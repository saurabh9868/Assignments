package array;

public class prime_number {
    public static void main(String[] args) {
        for(int i=2;i<101;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                   count+=1;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
