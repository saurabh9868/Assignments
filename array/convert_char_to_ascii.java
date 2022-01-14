package array;

import java.util.Scanner;

public class convert_char_to_ascii {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
                char c = sc.nextLine().charAt(0);
                int a=c;
                int b=a-32;
                char d=(char)b;
                System.out.println(d);
            }
    }

