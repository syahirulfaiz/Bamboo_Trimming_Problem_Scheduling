

import java.util.LinkedList;
import java.util.Queue;

public class BambooPrecision extends Bamboo {

	private static final int subtaskId = 2;
	private static final int[] growthRate = new int[]{2000, 3999, 4001};

	public static void main(String[] args) {
		Queue<Integer> solution = new LinkedList<Integer>();
		// Dont change anything above this line
		// ==========================
		
		String username = "user"; //Change this to your username
		
		//1.2003 (BEST)
		solution.add(2);
		solution.add(1);
		solution.add(0); // Add your solution here. Your solution should consist of numbers that are fed to a periodic queue, e.g. 0,1.
		
//		//STILL 1.2003....Although prioritise the two highest growthRate
//		solution.add(2);
//		solution.add(1);
//		solution.add(2);
//		solution.add(1);
//		solution.add(0); // Add your solution here. Your solution should consist of numbers that are fed to a periodic queue, e.g. 0,1.
		

//		//pinwheel still 1.2003....
//		solution.add(2);
//		solution.add(1);
//		solution.add(2);
//		solution.add(1);
//		solution.add(0);
//		solution.add(2);
//		solution.add(1);
//		solution.add(2);
//		solution.add(1);
//		solution.add(0);
		
		// ==========================
		// Dont change anything below this line
		Bamboo A = new Bamboo();
		A.calculateRatio(growthRate, solution, username, subtaskId);
	}

}
