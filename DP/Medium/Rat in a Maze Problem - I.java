/******************************************************************************************************************************************************
---------------------
Level- Medium
---------------------
Consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach the destination at (N - 1, N - 1).
Find all possible paths that the rat can take to reach from source to destination. 
The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right). Value 0 at a cell in the matrix represents
that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it.
Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell.

---------------------------------------------------------------------------------------
Example 1:

Input:
N = 4
m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
Output:
DDRDRR DRDDRR
Explanation:
The rat can reach the destination at 
(3, 3) from (0, 0) by two paths - DRDDRR 
and DDRDRR, when printed in sorted order 
we get DDRDRR DRDDRR.
Example 2:
Input:
N = 2
m[][] = {{1, 0},
         {1, 0}}
Output:
-1
Explanation:
No path exists and destination cell is 
blocked.

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    private static void Maze(int[][] board,int row, int col, ArrayList<String>list,String ans){
        if(row==board.length-1 && col==board[0].length-1){
            if(board[row][col]!=0){
                list.add(ans);
            }
            return;
        }
        if(row==board.length || col== board.length || row<0 || col<0 || board[row][col]==0){
            return ;
        }
        board[row][col]=0;
        
        // down call
        Maze(board,row+1,col,list,ans+'D');
        //up 
        Maze(board,row-1,col,list,ans+'U');
         //left
        Maze(board,row,col-1,list,ans+'L');
          // right
        Maze(board,row,col+1,list,ans+'R');
           
        board[row][col]=1;
    
    }
    public static ArrayList<String> findPath(int[][] board, int n) {
        ArrayList<String> list = new ArrayList<>();
        Maze(board,0,0,list,"");
        return list;
    }
    
}
