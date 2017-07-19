/*
 * A Java application to play a game that simulates the game of craps.
 */
package crapsgamesimulation;

import java.util.Random;

/**
 *
 * @author Jonathan Barisere
 */
public class CrapsGameSimulation {
	// static constructor to initialize the random number generator
	static {
		RND = new Random();
	}

	/**
	 *
	 * @param bound the upper limit for the random number generator
	 * @return a random number between zero and bound EXCLUSIVE
	 */
	public static int rollDice(int bound) {
		return RND.nextInt(bound);
	}

	/**
	 *
	 * @param diceVal the value of the sum of values on both dice
	 * @return true if diceVal equals either 2, 3, or 12; false otherwise
	 */
	public static boolean isCrap(int diceVal) {
		return (diceVal == 2
				|| diceVal == 3
				|| diceVal == 12);
	}

	/**
	 *
	 * @param diceVal the value of the sum of values on both dice
	 * @return true if diceVal equals either 7 or 11, false otherwise
	 */
	public static boolean isNatural(int diceVal) {
		return (diceVal == 7 || diceVal == 11);
	}

	private static void printDie(int first, int second) {
		System.out.printf("First die:\t%d\n"
				+ "Second die:\t%d\n", first, second);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.printf("Game of Craps!\n%s",
				"--------------\n");
		
		// Enum values to track game state
		GAME_STATE state;
		
		int bound = 7; // upper bound on die roll
		int firstDie, secondDie, dieSum;
		do {
			firstDie = rollDice(bound);
			secondDie = rollDice(bound);
			dieSum = firstDie + secondDie;
			printDie(firstDie, secondDie);
			
			if (isCrap(dieSum)) {
				System.out.println("Craps! You lose!");
				state = GAME_STATE.LOSE;
			} else if (isNatural(dieSum)) {
				System.out.println("Natural. You win!");
				state = GAME_STATE.WIN;
			} else {
				System.out.println("Keep playing...");
				state = GAME_STATE.PLAY;
			}
			
		} while(state == GAME_STATE.PLAY);
    
	}

	private final static Random RND;
	private enum GAME_STATE {
		PLAY, WIN, LOSE
	}
}