package array;

import java.util.Scanner;

public class check_the_char_in_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            System.out.println("enter the string");
            String a = sc.nextLine();
            char ch = sc.nextLine().charAt(0);
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ch) {
                    count++;
                }
            }
        System.out.println(count);

            System.out.println("enter the string");
            String b = sc.nextLine();
            b.toLowerCase();
            char ch2 = sc.nextLine().charAt(0);
            int count1 = 0;
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == ch2) {
                    count1++;
                }
            }
            System.out.println(count1);

    }
}

