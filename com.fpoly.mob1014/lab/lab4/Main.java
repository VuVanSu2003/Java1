package lab4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		Scanner choice = new Scanner(System.in);
		String key = "";
		do {
			System.out.println("\n<<<<<>>>>>\n1.Input\n2.Output\n0.Exit");
			System.out.print(">> Lua Chon: ");
			key = choice.nextLine();
			switch (Integer.parseInt(key)) {
			case 1:
				student.input();
				break;
			case 2:
				student.output();
				break;
			case 0:
				break;
			default:
				System.out.println("ERROR!");
				break;
			}
		} while (Integer.parseInt(key) != 0);
	}
}
