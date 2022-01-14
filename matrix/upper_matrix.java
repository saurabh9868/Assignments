package matrix;

import java.util.Arrays;

public class upper_matrix {
    public static void main(String[] args) {
        int num[][] ={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,51}};
        for(int gap=0;gap<num.length;gap++){
        for(int i=0;i< num.length;i++){
            System.out.println(Arrays.toString(num[i]));
        }
    }
}
}
