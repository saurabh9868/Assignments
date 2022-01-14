package array;
public class averagemarks {

    static void swapValuesUsingThirdVariable(int m, int n) {
        // Swapping the values
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is " + m
                + " and Value of n is " + n);
        return;
    }

    public static void main(String[] args) {
        int m = 9, n = 5;
        swapValuesUsingThirdVariable(m, n);
        //System.out.println(Math.pow(2,3));
    }
}