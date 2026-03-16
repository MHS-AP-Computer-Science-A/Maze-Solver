
public class MazeSolver {

	/* Recursively solves a maze by exploring all possible
	 * paths
	*/
	public static void solve(int[][] maze, boolean[][] visited, int row, int col) { 
		// Mark location as visited

		// If location is 3, print result (base case)

		// Recursively explore up, right, left, down aacording to the algorithm
		// rules

	}

	public static void main(String[] args) {
		// MAZE 1 
		int[][] maze1 = 
		      { { 1, 1, 0, 1, 1, 1, 3 },
				{ 2, 0, 0, 0, 1, 1, 0 },
				{ 1, 1, 1, 0, 1, 1, 0 },
				{ 3, 0, 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 1, 1, 1 },
				{ 3, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 0, 0, 1 } };

		boolean[][] visited1 = new boolean[maze1.length][maze1[0].length];

		//MAZE 2
		int[][] maze2 = 
		      { { 1, 0, 0, 0, 3, 1, 0, 0, 0, 3 },
				{ 1, 0, 1, 3, 1, 1, 0, 1, 1, 1 },
				{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 0, 1, 1, 1, 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 1, 1, 0, 1, 1, 1, 3 },
				{ 1, 0, 1, 1, 1, 0, 0, 0, 1, 1 },
				{ 1, 0, 1, 1, 1, 1, 1, 0, 1, 1 },
				{ 1, 0, 1, 1, 1, 1, 1, 0, 1, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 2 } };

		boolean[][] visited2 = new boolean[maze2.length][maze2[0].length];

		// SOLVE MAZE 1
		// --------------------------
		System.out.println("SOLVING MAZE 1");
		System.out.println("--------------------------");
		// Traverse to find the start



		// Call the solve method


		System.out.println("--------------------------");




		// SOLVE MAZE 2
		// --------------------------
		System.out.println("SOLVING MAZE 2");
		System.out.println("--------------------------");
		// Traverse to find the start



		// Call the solve method


		System.out.println("--------------------------");


	}
}
