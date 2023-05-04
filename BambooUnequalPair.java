

import java.util.LinkedList;
import java.util.Queue;

public class BambooUnequalPair extends Bamboo {

	private static final int subtaskId = 1;
	private static final int[] growthRate = new int[]{1, 199};

	public static void main(String[] args) {
		Queue<Integer> solution = new LinkedList<Integer>();
		// Dont change anything over this line
		// ==========================
		
		String username = "user"; //Change this to your username
		
		//1.99 (BEST)
		solution.add(1);
		solution.add(0); // Add your solution here. Your solution should consist of numbers that are fed to a periodic queue, e.g. 0,1.
		
		//Pinwheel Still 1.99.... 
		//for(int i=0; i<200; i++) {solution.add(1);}
		//for(int i=0; i<1; i++) {solution.add(0);}
				
		
		// ==========================
		// Dont change anything under this line
		Bamboo A = new Bamboo();
		A.calculateRatio(growthRate, solution, username, subtaskId);
	}

}
