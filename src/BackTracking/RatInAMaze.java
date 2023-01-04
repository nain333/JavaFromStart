package BackTracking;

public class RatInAMaze {
    public static void main(String Args[]){
        int maze[][]={{1,1,0,1},{1,1,0,1},{1,1,1,0},{1,1,1,1}};
        solveMaze(maze);

    }
    public static void solveMaze(int maze[][]){
        int n = maze.length;
        int path[][]=new int[n][n];
        solveMaze( maze,0,0,path);

    }
    public static void solveMaze(int maze[][],int i,int j, int[][] path){
//        valid cell:
        int n = maze.length;
        if (i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1){
            return;
        }
//        include cell:
        path[i][j]=1;
//        destination cell:
        if(i==n-1&&j==n-1){
            for (int r=0;r<n;r++){
                for (int c =0; c<n;c++){
                    System.out.print(path[r][c]);
                }
                System.out.println();

            }
            System.out.println();
            path[i][j]=0;
            return;

        }

//        explore all directions:
//        top:
        solveMaze(maze,i+1,j,path);
//        bottom:
        solveMaze(maze,i-1,j,path);
//        right:
        solveMaze(maze,i,j+1,path);
//        left:
        solveMaze(maze,i,j-1,path);
        path[i][j]=0;
        return;

    }


}
