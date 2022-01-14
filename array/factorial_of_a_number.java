package array;

public class factorial_of_a_number {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=n*fact(n-1);
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact(10));
        System.out.println(fact);
    }
}
