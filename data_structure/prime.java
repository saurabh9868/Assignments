package data_structure;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        for(int j=1;j<n;j++){
            int count=0;
        for(int i=1;i<n+1;i++){
            if(j%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.print(j+" ");
        }}
    }
}
