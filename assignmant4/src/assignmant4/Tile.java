package assignmant4;

public class Tile {// attributes bellow
	private boolean isWall;
	private boolean isExit;
	
	public Tile(boolean isWall, boolean isExit) {// attributes constructor
		this.isWall = isWall;
		this.isExit = isExit;		
	}
	
	public boolean isWall() {// method for wall getters
		return this.isWall;
	}

	public boolean isExit() {// method for exit getters
		return this.isExit;
	}
}
