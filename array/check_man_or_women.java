package array;

import java.util.Scanner;

public class check_man_or_women {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the gender");
        String gender = sc.next();
        System.out.println("enter the age");
        int age = sc.nextInt();
        if (gender.equals("m")  && age > 0 && age < 101) {
            if (age <= 25) {
                System.out.println("boy");
            } else {
                System.out.println("men");
            }
        }
        else if(gender.equals("f") && age>0 && age<101){
            if(age<=20){
                System.out.println("girl");
            }else {
                System.out.println("women");
            }
        }
        else{
            System.out.println("invalid input");
        }
    }
}