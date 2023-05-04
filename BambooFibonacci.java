
import java.util.LinkedList;
import java.util.Queue;

public class BambooFibonacci extends Bamboo {

	private static final int subtaskId = 4;
	private static final int[] growthRate = new int[]{1, 1, 2, 3, 5, 8, 13, 21};

	public static void main(String[] args) {
		Queue<Integer> solution = new LinkedList<Integer>();
		// Dont change anything above this line
		// ==========================
		
		String username = "user"; //Change this to your username

		//1.9444444 (BEST)		
		solution.add(7);//21
		solution.add(6);//13
		solution.add(5);//8
		solution.add(6);//13
		solution.add(4);//5
		solution.add(7);//21
		solution.add(3);//3		
		solution.add(2);//2
		solution.add(1);//1
		solution.add(0);//1
		

//		//2.1666667 (2nd BEST)
//		solution.add(7);
//		solution.add(6);
//		solution.add(5);
//		solution.add(4);
//		solution.add(7);
//		solution.add(3);
//		solution.add(2);
//		solution.add(1);
//		solution.add(0);
				
//		//3.1111112 (round robin) : 7,6,5,4,3,2,1
		
		
		
		// ==========================
		// Dont change anything under this line
		Bamboo main = new Bamboo();
		main.calculateRatio(growthRate, solution, username, subtaskId);
	}

}
