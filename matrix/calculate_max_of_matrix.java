package matrix;

public class calculate_max_of_matrix {
    public static void main(String[] args) {
        int arr1[][] = {{4, 12, 12},
                {2, 4, 10},
                {5, 7, 15}};
        for(int i=0;i<3;i++){
            int sum=Integer.MIN_VALUE;
            for(int j=0;j<3;j++){
                if(sum<arr1[i][j]){
                    sum=arr1[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}
