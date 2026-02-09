package assignmant4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		

        Player p = new Player();//new player
        
        System.out.println("What size of the maze you want? Put any number.");
        int size = s.nextInt();// player choosing the size of maze
        s.nextLine();// the code is stopping the enter to be used in the while loop
        
        Maze m = new Maze(size);
        boolean hasFound = false;

        while(!hasFound) {
        	//print position, remaining energy and moves player can move
            System.out.println("Player position: (" + p.getPlayerX() + ", " + p.getPlayerY() + ")");
            System.out.println("Energy: " + p.getEnergy());
            System.out.print("Move (W/A/S/D/Q): ");
            
            String dir = s.nextLine().toUpperCase();
            // making coordinates of player
            int x = p.getPlayerX();
            int y = p.getPlayerY();

            if(dir.equals("Q")) {
                System.out.println("Quit game!"); // if player wants to quit click Q
                break;
            } else if(dir.equals("W")) {
            	if (p.getPlayerY() < m.getSize() - 1) {
                if(!m.getTile(p.getPlayerX(), p.getPlayerY() + 1).isWall()) {
                    p.moveUp();// this is for moving up
                    p.decreaseEnergy();// after the move if you did not win you loose energy
                } else {
                    System.out.println("This is a wall!"); // it will tell if you hit the wall
                }
            	}
            } else if(dir.equals("S")) {
            	if (p.getPlayerY() > 0) {
                if(!m.getTile(p.getPlayerX(), p.getPlayerY() - 1).isWall()) {
                    p.moveDown();// this is for moving down
                    p.decreaseEnergy();// same like in W
                } else {
                    System.out.println("This is a wall!");// same like in W
                }
            	}
            } else if(dir.equals("A")) {
            	if (p.getPlayerX() > 0) {
                if(!m.getTile(p.getPlayerX() - 1, p.getPlayerY()).isWall()) {
                    p.moveLeft();// this is for moving left
                    p.decreaseEnergy();// like in W and S
                } else {
                    System.out.println("This is a wall!");// like in W and S
                }
            	}
            } else if(dir.equals("D")) {
            	if (p.getPlayerX() < m.getSize() - 1) {
                if(!m.getTile(p.getPlayerX() + 1, p.getPlayerY()).isWall()) {
                    p.moveRight();// this is for moving right
                    p.decreaseEnergy();// like in other moves 
                } else {
                    System.out.println("This is a wall!");// like in other moves
                }
            	}
            } else {
                System.out.println("You are crazy! This is nonsense!");
                continue;// for clicking wrong key (if you click wrongly it will remind player)
            }

            if(p.getEnergy() <= 0) {
                System.out.println("You ran out of energy. Game over!");
                break; // for running out of energy, player will lose
            }

            if(m.getTile(p.getPlayerX(), p.getPlayerY()).isExit()) {
                System.out.println("You escaped! You win!");
                break; // if you ever find exit, you will win. Good luck!
            }
        }

        s.close();
    }
}


