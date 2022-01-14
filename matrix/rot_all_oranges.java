package matrix;

public class rot_all_oranges {
    public static void main(String[] args) {
        int mat[][]={{2,2,0,1}};
        int N=mat.length;
        int M=mat[0].length;
        int ans[][]=new int[N][M];
        if(N>1 && M>1) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (mat[i][j] == 2) {
                        if (i == 0 && j == 0) {
                            if (mat[i + 1][j] != 0) {
                                mat[i + 1][j] = 2;
                            }
                            if (mat[i][j + 1] != 0) {
                                mat[i][j + 1] = 2;
                            }
                        } else if (i == 0 && j == M - 1) {
                            if (mat[i][j - 1] != 0) {
                                mat[i][j - 1] = 2;
                            }
                            if (mat[i + 1][j] != 0) {
                                mat[i + 1][j] = 2;
                            }
                        } else if (i == N - 1 && j == 0) {
                            if (mat[i - 1][j] != 0) {
                                mat[i - 1][j] = 2;
                            }
                            if (mat[i][j + 1] != 0) {
                                mat[i][j + 1] = 2;
                            }
                        } else if (i == N - 1 && j == M - 1) {
                            if (mat[i][j - 1] != 0) {
                                mat[i][j - 1] = 2;
                            }
                            if (mat[i - 1][j] != 0) {
                                mat[i - 1][j] = 2;
                            }
                        } else if (i == 0) {
                            if (mat[i + 1][j] != 0) {
                                mat[i + 1][j] = 2;
                            }
                            if (mat[i][j - 1] != 0) {
                                mat[i][j - 1] = 2;
                            }
                            if (mat[i][j + 1] != 0) {
                                mat[i][j + 1] = 2;
                            }
                        } else if (i == N - 1) {
                            if (mat[i - 1][j] != 0) {
                                mat[i - 1][j] = 2;
                            }
                            if (mat[i][j - 1] != 0) {
                                mat[i][j - 1] = 2;
                            }
                            if (mat[i][j + 1] != 0) {
                                mat[i][j + 1] = 2;
                            }
                        } else if (j == 0) {
                            if (mat[i + 1][j] != 0) {
                                mat[i + 1][j] = 2;
                            }
                            if (mat[i - 1][j] != 0) {
                                mat[i - 1][j] = 2;
                            }
                            if (mat[i][j + 1] != 0) {
                                mat[i][j + 1] = 2;
                            }
                        } else if (j == M - 1) {
                            if (mat[i + 1][j] != 0) {
                                mat[i + 1][j] = 2;
                            }
                            if (mat[i - 1][j] != 0) {
                                mat[i - 1][j] = 2;
                            }
                            if (mat[i][j - 1] != 0) {
                                mat[i][j - 1] = 2;
                            }
                        } else {
                            if (mat[i + 1][j] != 0) {
                                mat[i + 1][j] = 2;
                            }
                            if (mat[i - 1][j] != 0) {
                                mat[i - 1][j] = 2;
                            }
                            if (mat[i][j + 1] != 0) {
                                mat[i][j + 1] = 2;
                            }
                            if (mat[i][j - 1] != 0) {
                                mat[i][j - 1] = 2;
                            }
                        }

                    }
                }
            }
        }
        else if(N==1){
            int i=0;
            for(int j=0;j<M;j++){
                if(mat[i][j]==2){
                    if(j==0){
                        if(mat[i][j+1]!=0){
                            mat[i][j+1]=2;
                        }
                    }
                    if(j==M){
                        if(mat[i][j-1]!=0){
                            mat[i][j-1]=2;
                        }
                    }
                    else{
                        if(mat[i][j+1]!=0){
                            mat[i][j+1]=2;
                        }
                        if(mat[i][j-1]!=0){
                            mat[i][j-1]=2;
                        }
                    }
                }
            }
        }
        else if(M==1) {
            int j = 0;
            for (int i = 0; i < N; i++) {
                if (mat[i][j] == 2) {
                    if (i == 0) {
                        if (mat[i+1][j] != 0) {
                            mat[i+1][j] = 2;
                        }
                    }
                    if (i == M) {
                        if (mat[i-1][j] != 0) {
                            mat[i-1][j] = 2;
                        }
                    } else {
                        if (mat[i+1][j] != 0) {
                            mat[i+1][j] = 2;
                        }
                        if (mat[i-1][j] != 0) {
                            mat[i-1][j] = 2;
                        }
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
