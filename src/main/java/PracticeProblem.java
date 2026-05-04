/**
	* File: Lesson 4.1: While Loops and accumulators
	* Author: Raymond
	*	Date Created: April 3, 2023
	*	Date Last Modified: May 4, 2023
	*/

public class PracticeProblem {

 
	public static void main(String args[]) {
	
	}
	public static String seriesInclusive(int x) { 
		int num = 1;
		String numS = "";
		if (x <= 0) {
			return("");
		}
		while (x >= num) {
			if (num == x) {					
				numS += num;
				return numS;
			}
			numS += num + " ";
			num++;
		}
		return numS;
		}
		public static String seriesExclusive(int x) { 
		int num = 0;
		String numS = "";
		if (x <= 0) {
			return("");
		}
		while (x > num) {
			if (num == x) {					
				numS += num;
				return numS.trim();
			}
			numS += num + " ";
			num++;
		}
		return numS.trim();
		}
		
	

	public static void q1() {	
		
	}


	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
