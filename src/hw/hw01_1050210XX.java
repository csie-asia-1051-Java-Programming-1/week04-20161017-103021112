package hw;

import java.util.Scanner;
public class hw01_1050210XX {
	public static void main(String[] args) {
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("叫块计");
		i = scanner.nextInt();
		
		if(i == 1) {
			System.out.println("程计 = 1");
		} else if(i == 2) {
			System.out.println("程计 = 1");
		} else {
			int res = calculate(i);
			System.out.println("程计 = "+res);
		}
	}

	private static int calculate(int num) {
		int p1 = 1; 
		int p2 = 1; 
		int res = 0;
		for(int i = 3; i <= num; i++) {
			res = p1 + p2;
			p1 = p2;
			p2 = res;
		}
		
		return res;
	}

}