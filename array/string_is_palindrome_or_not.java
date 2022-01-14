package array;

import java.util.Arrays;
import java.util.Scanner;

public class string_is_palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the string which you want to convert into a char array and want to check palindrome");
            System.out.println("with assuming upper and lower case");
            String a = sc.nextLine();
            char arr[] = a.toCharArray();
            System.out.println(Arrays.toString(arr));
            boolean flag = true;
            for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
                if (arr[i] != arr[j]) {
                    flag = false;
                    break;
                }
            }
            System.out.println("your answer for that array is " + flag);

           /* System.out.println();
            System.out.println("without assuming the capital and small for check enter string");
            String str = sc.nextLine();
            str.toLowerCase();
            char arr2[] = str.toCharArray();
            System.out.println(Arrays.toString(arr2));
            boolean flag2 = true;
            for (int i = 0, j = arr2.length - 1; i < j; i++, j--) {
                if (arr2[i] != arr2[j]) {
                    flag2 = false;
                    break;
                }
            }
            System.out.println(flag2);*/
        }
    }

