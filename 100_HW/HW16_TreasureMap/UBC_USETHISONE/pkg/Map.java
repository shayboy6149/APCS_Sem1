package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
map = map[row][column];
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureX = (int)(Math.random()*posx);
		treasureY=(int)(Math.random()*posy);

	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		if(m<1 || m>8){
			return false;
		}
		else{
			return true;
		}
		
		
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		if (row >= map.length || col >= map[0].length || row < 0 || col < 0){
			return false;
		}
		else{

		return true;

	
	}
	
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if(map[row][column] == map[treasureX][treasureY]){
			return true;
		}
		
		else{
			map[row][column]++;
			return false;
		} 

			// Dummy value to make work
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		System.out.println("Sad to see you go!");
		System.out.println("The treasure was at " + treasureX + "," + treasureY);

	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		for(int r = 0 ; r<map.length ; r++){
			for(int c = 0 ; c< map.length ; c++){
				System.out.println(map[r][c]);
			}
			
		}

	}

}
