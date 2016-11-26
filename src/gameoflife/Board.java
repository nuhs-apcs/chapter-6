package gameoflife;

public class Board {
	
	private boolean[][] state, nextState;
	private int rows, cols;
	
	public Board(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		state = new boolean[rows][cols];
		nextState = new boolean[rows][cols];
	}
	
	public static Board random(int rows, int cols) {
		Board board = new Board(rows, cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				board.state[i][j] = Math.random() > 0.5;
			}
		}
		return board;
	}
	
	public static Board fromAlive(int rows, int cols, int[][] points) {
		Board board = new Board(rows, cols);
		for (int i = 0; i < points.length; i++) {
			int[] point = points[i];
			int row = point[0];
			int col = point[1];
			board.state[row][col] = true;
		}
		return board;
	}
	
	public Board copy() {
		Board board = new Board(rows, cols);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				board.state[i][j] = state[i][j];
			}
		}
		return board;
	}
	
	public int getCols() {
		return cols;
	}
	
	public int getRows() {
		return rows;
	}
	
	public boolean[][] getState() {
		return state;
	}
	
	public boolean isInside(int row, int col) {
		// YOUR CODE HERE
		return false;
	}
	
	public void setCell(int row, int col, boolean value) {
		if (isInside(row, col)) {
			state[row][col] = value;
		}
	}
	
	public boolean getCell(int row, int col) {
		if (isInside(row, col)) {
			return state[row][col];			
		} else {
			return false;
		}
	}
	
	public void shiftState() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				state[i][j] = nextState[i][j];
				nextState[i][j] = false;
			}
		}
	}
	
	public void update() {
		// YOUR CODE HERE
	}
	
	public static int[][] getNeighbors(int row, int col) {
		// YOUR CODE HERE
		return null;
	}
	
}
