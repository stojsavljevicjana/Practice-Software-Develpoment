package assignmant4;

import java.util.ArrayList;

public class Maze {// attributes below
	private Tile[][]grid;
	private int size;
	private int exitX;
	private int exitY;
	private int wallX;
	private int wallY;

	ArrayList<int[]> coordinates = new ArrayList<>();// array list for coordinates that are not walls or duplicate walls
	
	public Maze (int size) {// attributes constructor
		this.grid = new Tile [size][size];
		this.size = size;
	    for (int x = 0; x < size; x++) {
	        for (int y = 0; y < size; y++) {
	            grid[x][y] = new Tile(false, false);
	        }
	    }
	    
		this.exitX = (int) (Math.random()*size);// random exit
		this.exitY = (int) (Math.random()*size);// random exit
			
		grid[exitX][exitY] = new Tile(false, true); // exit

		coordinates.add(new int[]{0, 0}); // item in the array list for start
		coordinates.add(new int[]{exitX, exitY});// item in the array list for exit

		
		for (int x = 0; x < size; x++) {
			this.wallX = (int) (Math.random()*size);	
			this.wallY = (int) (Math.random()*size);	
			boolean duplicate = false;
			for (int al = 0; al < coordinates.size(); al++) {
				if (this.wallX == coordinates.get(al)[0]){
					if (this.wallY == coordinates.get(al)[1]) {
						duplicate = true;
						break;// loop for making walls but not in the start, exit and not to duplicate walls
					}
				}
			}
			if (duplicate == false) {
				 grid[wallX][wallY] = new Tile(true, false);// assigning walls
			     coordinates.add(new int[]{wallX, wallY}); // new walls to avoid duplicate
			}
	       
		}
		
	}

	public Tile getTile(int x, int y){ // getter for tile
		return grid[x][y];
	}
	public int getSize() {// getter for size
		return this.size;
	}

}
