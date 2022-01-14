package matrix;

public class find_the_celebrity {
    static int MATRIX[][] = { { 0, 1, 0, 0 },
            { 0, 0, 0, 0 },
            { 0, 1, 0, 0 },
            { 0, 1, 0, 0 } };
    static int knows(int a, int b) {
        return MATRIX[a][b];
    }
    public static void main(String[] args) {
        int n=4;
        int outdegree[]=new int[4];
        int indegre[]=new int[4];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x=knows(i,j);
                outdegree[i]+=x;
                indegre[j]+=x;
            }
        }
        int a=-1;
        int i=0;
        for( i=0;i<n;i++){
            if(indegre[i]==n-1 && outdegree[i]==0){
                a=1;
                break;
            }
        }
        if(a==1){
            System.out.println("celebrity is present at "+i+"  position");
        }
        else{
            System.out.println("celebrity is not present");
        }
    }
}
