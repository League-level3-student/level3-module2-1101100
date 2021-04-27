package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i).equals(true)) {
				return i;
			}
		}
		
		return -1;
	}

	public static double findTallest(List<Double> peeps) {
		double largestPeep = peeps.get(0);
		double currentPeep;
		for(int i = 0; i < peeps.size(); i++) {
			currentPeep = peeps.get(i);
			if(currentPeep > largestPeep) {
				currentPeep = largestPeep;
			}
		}
		return largestPeep;
	}

	public static String findLongestWord(List<String> words) {
		String largestWord = words.get(0);
		String currentWord;
		for(int i = 0; i < words.size(); i++) {
			currentWord = words.get(i);
			if(currentWord.length() > largestWord.length()) {
				currentWord = largestWord;
			}
		}
		return largestWord;
	}

	public static boolean containsSOS(List<String> message2) {
		for(int i = 0; i < message2.size(); i++) {
			if(message2.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for(int i = 0; i < results.size(); i++) {
			for(int j = 0; j < results.size() - 1; j ++) {
				if(results.get(j) > results.get(j+1)) {
					double getJ = results.get(j);
					results.set(j, results.get(j + 1));
					results.set(j+1, getJ);
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSeq) {
		for(int i = 0; i < unsortedSeq.size(); i ++) {
			for(int j = 0; j < unsortedSeq.size() - 1; j ++) {
				if (unsortedSeq.get(j).length() > unsortedSeq.get(j + 1).length()) {
				String getJ = unsortedSeq.get(j);
				unsortedSeq.set(j, unsortedSeq.get(j + 1));
				unsortedSeq.set(j+1, getJ);
				}
			}
		}
		return unsortedSeq;
	}

	public static List<String> sortWords(List<String> words) {
		for(int i = 0; i < words.size(); i ++) {
			for(int j = 0; j < words.size() - 1; j ++) {
				 if( words.get(j).compareTo(words.get(j+1)) > 0 ) {
					 String getJ = words.get(j);
					 words.set(j, words.get(j + 1));
					 words.set(j+1, getJ);
				 }
			}
		}
		return words;
	}

	public static Object multiply(int i, int j) {
		int x = i*j;
		String ret = i + " x " + j + " = " + x; 
		return ret;
	}

	public static boolean isPrime(int i) {
		if(i == 2) {
			return true;
		}
		for(int j = 2; j <= Math.ceil(Math.sqrt(i)); j++) {
			if(i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSquare(int i) {
		double squareRoot = Math.sqrt(i);
		if(squareRoot == Math.floor(squareRoot)) {
			return true;
		}
		return false;
	}

	public static boolean isCube(int i) {
		double cubeRoot = Math.cbrt(i);
		if(cubeRoot == Math.floor(cubeRoot)) {
			return true;
		}
		return false;
	}
    

    
}
