public class GridGrowth {
    public static int twoDimensions(String[] coordinates, int n) {

        int max = 0;
        int[][] grid = new int[n][n];
        int arrLength = coordinates.length;

        for (int i = 0; i < arrLength; i++) {

            String[] coors = coordinates[i].split(" ");
            int row = Integer.parseInt(coors[0]);
            int column = Integer.parseInt(coors[1]);

            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {

                    grid[j][k] += 1;
                    if(grid[j][k] > max){
                        max = grid[j][k];
                    }
                }
            }
        }

        /*for(int j =0 ; j< grid.length ; j++){
            for(int k = 0; k < grid[j].length;k++){
                if(grid[j][k] > max){
                    max = grid[j][k];
                }
            }
        }*/

        return max;
    }

    public static void main(String[] args) {

        String[] coors = { "1 4", "2 3", "4 1" };
        System.out.println("The Max and count Are:" + twoDimensions(coors, 4));
    }
}
