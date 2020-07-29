import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

/**
 * MIT License (http://choosealicense.com/licenses/mit/)
 * 
 * Lottery
 * 
 * Generate 6 unique random numbers (no duplicates) between 1 and 49 using a
 * Set.
 * 
 * @see http://www.VariationenZumThema.de/
 * @author Khen Brian N. K. Quartey
 */
public class Lottery extends ConsoleProgram {

	private RandomGenerator rgen = new RandomGenerator();

	public void run() {

		println("Your six lottery numbers using Set are: " + generateLotteryNumbersSets());

		println("Your six lottery numbers using Arraylist are: " + generateLotteryNumbers());

	}

	// method for generating six random numbers with ArrayList
	private ArrayList<Integer> generateLotteryNumbers() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		while (numberList.size() < 6) {
			int randomNumbers = rgen.nextInt(1, 49);
			if (!numberList.contains(randomNumbers)) {
				numberList.add(randomNumbers);
				// sort the random numbers
				Collections.sort(numberList);
			}
		}
		return numberList;

	}

	// method for generating six random numbers with Set
	private Set<Integer> generateLotteryNumbersSets() {
		Set<Integer> set = new HashSet<>();
		Set<Integer> tree_Set = new TreeSet<Integer>();

		while (set.size() < 6) {
			int numbers = rgen.nextInt(1, 49);
			set.add(numbers);
			tree_Set = new TreeSet<Integer>(set);
		}
		return tree_Set;
	}

}
