package collection.list;

import java.util.Arrays;
import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        String a="rad";
        String b="dra";
        char[] f=a.toCharArray();
        char[] s=b.toCharArray();
        char[] str=new char[a.length()];
        boolean is_anagram=true;
        if(a.length()!=b.length()){
            is_anagram=false;
        }

        Arrays.sort(f);
        Arrays.sort(s);
        for (int i=0;i<f.length;i++){
            if(f[i] !=s[i]){
                is_anagram=false;
            }
        }
        System.out.println(is_anagram);
    }
}


