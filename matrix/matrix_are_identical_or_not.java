package matrix;

public class matrix_are_identical_or_not {
    public static void main(String[] args) {
        int arr1[][] = {{1, 4, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < arr1.length; i++) {
            int sum=0;
            for (int j = 0; j < arr1[0].length; j++) {
                sum+=arr1[i][j];
            }
            System.out.print(sum+" ");
        }
        System.out.println();
        for (int i = 0; i < arr1[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr1.length; j++) {
                sum += arr1[j][i];
            }
            System.out.print(sum+" ");
        }

    }
}
