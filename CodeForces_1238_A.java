import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeForces_1238_A {
	// problem statement
	/*
	 * You are given two integers x and y (it is guaranteed that x>y). You may
	 * choose any prime integer p and subtract it any number of times from x. Is it
	 * possible to make x equal to y
	 */
	static String possibleOperation(long x, long y) {
		long p = x - y;
		if (p == 1) {
			return "NO";
		} else {
			return "YES";
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Long x[], y[];
		Scanner scanner = new Scanner(System.in);

		int test = scanner.nextInt();
		x = new Long[test];
		y = new Long[test];
		String v=scanner.nextLine();
		  
		 for (int i = 0; i < test; i++) {
			String input = scanner.nextLine();
			String[] strs = input.trim().split("\\s+");
			x[i] = Long.parseLong(strs[0]);
			y[i]=Long.parseLong(strs[1]);
		}
		for (int i = 0; i < y.length; i++) {
			System.out.println(possibleOperation(x[i], y[i]));	
		} 
		
	}

}
