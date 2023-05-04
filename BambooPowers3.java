
import java.util.LinkedList;
import java.util.Queue;


public class BambooPowers3 extends Bamboo {

	private static final int[] growthRate = new int[]{3, 6, 12, 24, 48, 96, 192, 386};
	private static final int subtaskId = 5;

	public static void main(String[] args) {
		Queue<Integer> solution = new LinkedList<Integer>();
		// Dont change anything above this line
		// ==========================
		
		String username = "user"; //Change this to your username
		
		//2.5032594 (BEST)
		solution.add(7);//386
		solution.add(6);//192
		solution.add(7);//386
		solution.add(5);//96
		solution.add(4);//48
		solution.add(3);//24		
		solution.add(7);//386
		solution.add(2);//12
		solution.add(1);//6
		solution.add(0);//3
		
		
//		//2.5162973 (2nd BEST)
//		solution.add(7);
//		solution.add(6);
//		solution.add(5);
//		solution.add(4);
//		solution.add(7);
//		solution.add(3);
//		solution.add(2);
//		solution.add(1);
//		solution.add(0);
		
//		//4.026076 (round robin): 7,6,5,4,3,2,1,0

		
		// ==========================
		// Dont change anything under this line
		Bamboo A = new Bamboo();
		A.calculateRatio(growthRate, solution, username, subtaskId);
	}

}
