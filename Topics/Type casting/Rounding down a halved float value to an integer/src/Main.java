import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float floatVariable = scanner.nextFloat();

		int result = (int) (floatVariable / 2);

		System.out.println(result);

		scanner.close();
	}
}