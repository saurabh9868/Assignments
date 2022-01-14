package matrix;

public class check_a_matrix_is_identical_or_not {
    public static void main(String[] args) {
        int arr1[][] = {{4, 0, 0},
                {0, 4, 0},
                {0, 0, 5}};
        boolean is_identical=true;
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                int val=arr1[i][j];
                if(i!=j){
                   if(val!=0){
                       is_identical=false;
                   }
                }
                if(i==j && val==0){
                    is_identical=false;
                }
                else if(i==j ){
                    if(val/val!=1){
                        is_identical=false;
                    }
                }

            }
        }
        System.out.println(is_identical);
    }
}
