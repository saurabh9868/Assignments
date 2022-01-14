package matrix;

public class find_all_rot_oranges {
    static int R = 3;
    static int C = 5;

    // Check if i, j is under the array
// limits of row and column
    static boolean issafe(int i, int j)
    {
        if (i >= 0 && i < R && j >= 0 && j < C){
            return true;
        }
        return false;
    }

    static int rotOranges(int v[][])
    {
        boolean changed = false;
        int no = 2;

        while (true)
        {
            for(int i = 0; i < R; i++)
            {
                for(int j = 0; j < C; j++)
                {

                    // Rot all other oranges present at
                    // (i+1, j), (i, j-1), (i, j+1), (i-1, j)
                    if (v[i][j] == no)
                    {
                        if (issafe(i + 1, j) &&
                                v[i + 1][j] == 1)
                        {
                            v[i + 1][j] = v[i][j] + 1;
                            changed = true;
                        }
                        if (issafe(i, j + 1) &&
                                v[i][j + 1] == 1)
                        {
                            v[i][j + 1] = v[i][j] + 1;
                            changed = true;
                        }
                        if (issafe(i - 1, j) &&
                                v[i - 1][j] == 1)
                        {
                            v[i - 1][j] = v[i][j] + 1;
                            changed = true;
                        }
                        if (issafe(i, j - 1) &&
                                v[i][j - 1] == 1)
                        {
                            v[i][j - 1] = v[i][j] + 1;
                            changed = true;
                        }
                    }
                }
            }
            if (!changed)
                break;

            changed = false;
            no++;
        }

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                if (v[i][j] == 1)     // If any orange is found to benot rotten then ans is not possible
                    return -1;
            }
        }
        return no - 2;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int v[][] = { { 2, 1, 0, 2, 1 },
                { 1, 0, 1, 2, 1 },
                { 1, 0, 0, 2, 1 } };

        System.out.println("Max time incurred: " + rotOranges(v));
    }
}


