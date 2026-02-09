package assignmant4;

public class Player { // attributes below
	private int energy;
	private int playerX;
	private int playerY;
	
	public Player() {//attributes constructor
		this.energy = 50;
		this.playerX = 0;
		this.playerY = 0;
	}
	
	public int getEnergy() {
		return this.energy; // getter for energy
	}
	
	public int getPlayerX() {
		return this.playerX;// getter for X coordinate
	}
	
	public int getPlayerY() {
		return this.playerY;// getter for Y coordinate
	}
	
	public void moveUp() {
		this.playerY = this.playerY + 1; // method for moving up
	}
	
	public void moveDown() {
		this.playerY = this.playerY - 1;// method for moving down
	}
	
	public void moveLeft() {
		this.playerX = this.playerX - 1;// method for moving left
	}
	
	public void moveRight() {
		this.playerX = this.playerX + 1;// method for moving right
	}
	public void decreaseEnergy() {
	    energy--;// method for decreasing the energy
	}

}
