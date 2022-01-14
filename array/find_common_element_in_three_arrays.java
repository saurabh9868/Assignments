package array;

public class find_common_element_in_three_arrays {
    public static void main(String[] args) {
        int A []= {1, 5, 10, 20, 40, 80};
        int B []= {6, 7, 20, 80, 100};
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};

        for(int i=0;i< A.length;i++){
            if(A[i]<B[0]){
                continue;
            }
            else{
                for(int j=0;j< B.length;j++){
                    if(B[j]>C[0] && A[i]==B[j]){
                       for(int k=0;k<C.length;k++){
                           if(B[j]==C[k]){
                               System.out.println(C[k]);
                           }
                       }
                    }
                    else {
                        continue;
                    }
                }
            }
        }
    }
}
