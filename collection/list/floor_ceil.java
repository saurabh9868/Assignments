package collection.list;

import java.util.Scanner;

public class floor_ceil {
    public static void main(String[] args) {
        int arr[]={1,2,5,10,50,100};
        Scanner sc=new Scanner(System.in);
        int data= sc.nextInt();
        int low=0;
        int high=arr.length-1;
        boolean is_present=false;
        while(low<high){
            int mid=(low+high)/2;
            if(data<arr[mid]){
                high=mid-1;
            }
            else if(data>arr[mid]){
                low=mid+1;
            }
            else{
                is_present=true;
                break;
            }
        }
        if(is_present){
            System.out.println("number is present");
        }
        else{
            System.out.println("number is not present");
        }
    }
}
