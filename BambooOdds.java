
import java.util.LinkedList;
import java.util.Queue;

public class BambooOdds extends Bamboo {


	private static final int subtaskId = 3;
	private static final int[] growthRate = new int[]{3, 3, 3, 5, 5, 7, 7, 9};

	public static void main(String[] args) {
		Queue<Integer> solution = new LinkedList<Integer>();
		// Dont change anything above this line
		// ==========================
		
		String username = "user"; //Change this to your username
		
		
		//1.5 (BEST)	
		//the idea is to cut the highest growth rate as often as possible
		//the growth factors of first three bamboos are the factor of last bamboo. We need to cut last bamboo more often twice than others.
		solution.add(7); // Add your solution here. Your solution should consist of numbers that are fed to a periodic queue, e.g. 0,1.
		solution.add(6);
		solution.add(5);
		solution.add(4);
		solution.add(3);
		solution.add(7);
		solution.add(2);
		solution.add(1);
		solution.add(0);
		
//		//1.6
//		//follow pinwheel problem, did not succeed
//		solution.add(7);
//		solution.add(6);
//		solution.add(5);
//		solution.add(7);
//		solution.add(4);
//		solution.add(3);
//		solution.add(7);
//		solution.add(2);
//		solution.add(1);
//		solution.add(0);
		
//		//round robin: 1.7142857 : 7,6,5,4,3,2,1,0
		
		
		// ==========================
		// Dont change anything below this line
		Bamboo A = new Bamboo();
		A.calculateRatio(growthRate, solution, username, subtaskId);
	}

}
