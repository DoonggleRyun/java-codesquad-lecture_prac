import java.util.Scanner;

public class Gugudan {

	public static int[] calculate(int times) {
		int[] result = new int[0];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * //2단
		 * 
		 * for (int i = 1; i < 10; i++) { System.out.println(2 * i); }
		 * 
		 * 
		 * System.out.println("구구단 중 출력할 단은? : "); Scanner scanner = new
		 * Scanner(System.in); int number = scanner.nextInt(); int start =1, end = 9;
		 * for (int i = start; i <= end; i++) { System.out.println(number * i); }
		 */
		for (int i = 2; i < 10; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}
	
}
