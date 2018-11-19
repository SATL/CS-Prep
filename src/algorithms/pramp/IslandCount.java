package algorithms.pramp;

public class IslandCount {

    public static void clearIsland(int[][] matrix, int row, int col){
        System.out.println("------"+row+" "+col+"= "+matrix[row][col]);
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        if(matrix[row][col] == 1){
            matrix[row][col] = 0 ;
            if(row+1 < rowSize) {
                if(col+1<colSize)
                    clearIsland(matrix, row+1, col+1);
                clearIsland(matrix, row + 1, col);
                if(col-1>=0)
                    clearIsland(matrix, row+1, col-1);
            }


            if(col+1<colSize)
                clearIsland(matrix, row, col+1);

            if(col>0)
                clearIsland(matrix, row, col-1);

            if(row-1 > 0) {
                if (col - 1 >= 0)
                    clearIsland(matrix, row - 1, col - 1);
                clearIsland(matrix, row - 1, col);
                if(col+1<colSize)
                    clearIsland(matrix, row - 1, col+1);
            }
        }
    }

    public static boolean isIsland(int[][] matrix, int row, int col){
        System.out.println(row+" "+col+"= "+matrix[row][col]);
        if(matrix[row][col] == 1){
            clearIsland(matrix, row, col);
            return true;
        }
        return false;
    }

    public static int  getTotalslands(int[] [] matrix){
        int count=0;
        for(int row=0; row<matrix.length; ++row){
            for(int col=0; col<matrix[0].length; ++col){
                if(isIsland(matrix, row, col)){
                    count++;
                }
                System.out.println(count);
            }
        }
        return count;
    }


    public static void main(String[] args){
        int mat[][] = {{1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 0, 1, 0, 1}
        };
        int mat2[][] = {{1, 1, 0},
                        {0, 0, 0},
                        {1, 0, 0}
        };

        System.out.println(getTotalslands(mat));
    }
}
