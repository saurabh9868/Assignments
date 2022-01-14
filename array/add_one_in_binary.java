package array;

import java.util.Scanner;

public class add_one_in_binary {
    public static void main(String[] args) {
        int num=15;
        int count=0;
        int m=1;
        while((num&m)!=0){
            m=m<<1;
            count++;
        }
        for(int i=0;i<=count;i++){
            int val=(int)(Math.pow(2,i));
            num= num^val;
        }
        System.out.println(num);
    }
}
