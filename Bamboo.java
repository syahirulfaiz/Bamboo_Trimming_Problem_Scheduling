
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Queue;


public class Bamboo {

	private static final String cvsSplitBy = ",";
	private static final int NUMBER_OF_ITERATIONS = 10000;
	private static final String csvFile = "results.csv";

	public static void writeResults(int subtaskId, float ratio, String username, File csvFile) throws IOException {
		String ratioString = String.valueOf(ratio);
		String[] results = {"", "", "", "", "", ""};


		try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = (line + " ").split(cvsSplitBy);
				System.arraycopy(parts, 0, results, 0, 6);
			}
		} catch (FileNotFoundException e) {
			// ignore; simply use empty results
		}

		results[subtaskId] = ratioString;

		try (PrintWriter writer = new PrintWriter(csvFile)) {

			writer.write(username +
					cvsSplitBy + results[1].trim() +
					cvsSplitBy + results[2].trim() +
					cvsSplitBy + results[3].trim() +
					cvsSplitBy + results[4].trim() +
					cvsSplitBy + results[5].trim() + '\n');
			writer.flush();
		}
	}

	public void calculateRatio(int[] growthRate, Queue<Integer> solution, String username, int position) {
		int n = growthRate.length;
		int maxHeight = 0;
		int[] count = new int[n];
		Arrays.fill(count, 1);

		int sumOfGrowthRates = Arrays.stream(growthRate).sum();

		for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
			int toCut = solution.remove();
			for (int j = 0; j < n; j++)
				maxHeight = Math.max(maxHeight, count[j] * growthRate[j]);
			for (int j = 0; j < n; j++) {
				if (j == toCut)
					count[j] = 1;
				else
					count[j]++;
			}
			solution.add(toCut);
		}
		float ratio = ((float) maxHeight / (float) sumOfGrowthRates);
		System.out.println(" Ratio= " + ratio + " MaxHeight= " + maxHeight + " SumOfGrowthRates= " + sumOfGrowthRates);
		File csvFile = new File(Bamboo.csvFile);
		try {
			writeResults(position, ratio, username, csvFile);
		} catch (IOException e) {
			System.err.println("Could not save result to " + csvFile);
			e.printStackTrace();
		}
	}
}	
