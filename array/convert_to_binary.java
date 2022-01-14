package array;

import java.util.Arrays;
import java.util.Scanner;


public class convert_to_binary {
    public static int count_bit(int num){
        int count=0;
        while(num!=0){
            if((num & 1)==1){
                count++;
            }
            num=(num>>1);
        }
        return count;
    }
    public static int count_total_bit(int num){
        int count=0;
        while(num!=0){
            count ++;
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2= sc.nextInt();
       int result=count_bit(num);
       int result2=count_bit(num2);
       int total=count_total_bit(num);
       int total2=count_total_bit(num2);
        if(result==result2 && total==total2){
            System.out.println("both are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
