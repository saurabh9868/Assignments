package array;

import java.util.Arrays;

public class reverse_an_string {
    public static void main(String[] args) {
        String b="saurabh";
        char a[]=b.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(a));
    }
}
