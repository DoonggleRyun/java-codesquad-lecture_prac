import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		//2��
		
		for (int i = 1; i < 10; i++) {
			System.out.println(2 * i);	
		}
		
		
		System.out.println("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int start =1, end = 9;
		for (int i = start; i <= end; i++) {
			System.out.println(number * i);	
		}
		
	}
	
}
