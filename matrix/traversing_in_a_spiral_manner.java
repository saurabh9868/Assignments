package matrix;

public class traversing_in_a_spiral_manner {
    public static void main(String[] args) {
        int num[][] = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {27, 29, 37, 48},
                       {32, 33, 39, 51}};
        int r= num.length;
        int c=num[0].length;
        int k=0;
        int l=0;
        int i=0;
        while(k<r && l<c){
            for(i=k;i<c;i++){//left to right
                System.out.print(num[k][i]+" ");
            }
            k++;
            for(i=k;i<r;i++){
                System.out.print(num[i][c-1]+" ");
            }
            c--;
            if(k<r){
                for(i=c-1;i>=l;i--){
                    System.out.print(num[r-1][i]+" ");
                }
            }
            r--;
            if(l<c){
                for(i=r-1;i>=k;i--){
                    System.out.print(num[i][l]+" ");
                }
            }
            l++;
        }
    }
}