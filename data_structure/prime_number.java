package data_structure;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String prime_number=" ";

        for(int i=1;i<=n;i++){
            int count=0;
            for(int num=i;num>=1;num--){
                if(i%num==0){
                    count=count+1;
                }
                }if(count==2){
                prime_number= prime_number+i+" ";
            }
        }System.out.println(prime_number);
    }
}
