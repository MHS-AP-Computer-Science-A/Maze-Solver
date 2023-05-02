
public class MazeSolver {
	
	public static void main(String[] args) {
		int[][] maze = 
			{{1,1,0,1,1,1,3},
			{2,0,0,0,1,1,0},
			{1,1,1,0,1,1,0},
			{3,0,1,0,0,0,0},
			{1,0,0,0,1,1,1},
			{3,1,1,0,1,0,1},
			{0,0,0,0,0,0,1}};
		
		//TODO: find the start of the maze
		
		//TODO: call the solve method
		
	}
	
	public static void solve(int[][] maze, int row, int col) {
		if(maze[row][col] == 3) {
			//Base case, found cupcake
			System.out.println("Cupcake found at (" + row + ", " + col + ")");
		}
		else {
			int numRows = maze.length;
			int numCols = maze[0].length;
			
			//TODO: Recursively check up, down, left, right
			
		}
		
	}
}
