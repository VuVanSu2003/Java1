package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class List {
	public ArrayList<Employee> list = new ArrayList<>();
	private Scanner sc;

	public static void main(String[] args) {
		List list = new List();
		list.menu();
	}

	public List() {
		this.list = new ArrayList<>();
		sc = new Scanner(System.in);
	}

	public List(ArrayList<Employee> list) {
		this.list = list;
	}

	public void menu() {
		String key = "";
		do {
			System.out.println("\n\t\t<<<<MENU>>>>");
			System.out.println("1. Add");
			System.out.println("2. Show info");
			System.out.println("3. Search By code");
			System.out.println("4. Delete By code");
			System.out.println("5. Update By code");
			System.out.println("6. Search By salary");
			System.out.println("7. Sort By name");
			System.out.println("8. Sort By income");
			System.out.println("9. Show 5 employees highest income" + "\n0. Exit");
			System.out.print("Your choice: ");
			key = sc.nextLine();
			switch (Integer.parseInt(key)) {
			case 1:
				System.out.println("\n> ADD EMPLOYEE <");
				addEmployee();
				break;
			case 2:
				System.out.println("\n> Show info <");
				showInfo();
				break;
			case 3:
				System.out.println("\n> Search By code <");
				searchByCode();
				break;
			case 4:
				System.out.println("\n> Delete By code <");
				deleteByCode();
				break;
			case 5:
				System.out.println("\n> Update By code <");
				updateByCode();
				break;
			case 6:
				System.out.println("\n> Search By salary <");
				searchBySalary();
				break;
			case 7:
				System.out.println("\n> Sort By name <");
				sortByName();
				break;
			case 8:
				System.out.println("\n> Sort By income <");
				sortBySalary();
				break;
			case 9:
				System.out.println("\n> Show 5 employees highest income <");
				showHighIncome();
				break;
			case 0:
				System.out.println("\n> GOOD LUCK <");
				break;
			default:
				System.out.println("\n> Syntax error! Retype! <");
				break;
			}
		} while (Integer.parseInt(key) != 0);
	}

//	Y1
	public void addEmployee() {

		System.out.print(">> Enter code: ");
		String code = sc.nextLine();
		System.out.print(">> Enter name: ");
		String name = sc.nextLine();
		System.out.print(">> Enter salary: ");
		Integer salary = sc.nextInt();
		sc.nextLine();
		System.out.print(">> Enter title: ");
		String title = sc.nextLine();
		if (title.equals("Administrative")) {
			Employee nv = new Administrative(code, name, title, salary);
			list.add(nv);

		} else if (title.equalsIgnoreCase("Marketing")) {
			System.out.print(">> Enter sales: ");
			Integer sales = sc.nextInt();
			sc.nextLine();
			System.out.print(">> Enter commissions: ");
			Integer commissions = sc.nextInt();
			sc.nextLine();
			Employee nv = new Marketing(name, code, title, salary, sales, commissions);
			list.add(nv);

		} else if (title.equalsIgnoreCase("Manager")) {
			System.out.print(">> Enter salary liability: ");
			Integer liability = sc.nextInt();
			sc.nextLine();
			Employee nv = new Manager(code, name, title, salary, liability);
			list.add(nv);
		} else {
			System.out.print("\n> Title does not exist! <\n>> Retype!(Y(yes)/N(no)?: ");
			if (sc.nextLine().equalsIgnoreCase("Y")) {
				addEmployee();
			} else {
				menu();
			}
		}
		System.out.print(">> Enter more?(Y(yes)/N(no): ");
		String key = sc.nextLine();
		if ((key.equalsIgnoreCase("Y")) || (key.equalsIgnoreCase("YES"))) {
			addEmployee();
		} else {
			return;
		}

	}

//	Y2
	public void showInfo() {
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

//	Y3
	public void searchByCode() {
		System.out.print(">> Enter code: ");
		String code = sc.nextLine();
		for (Employee emp : list) {
			if (code.equals(emp.getCode())) {
				System.out.println(emp);
				return;
			}
			System.out.println("\n> Code does not exist! <");
		}
	}

//	Y4
	public void deleteByCode() {
		System.out.print(">> Enter code: ");
		String code = sc.nextLine();
		for (Employee emp : list) {
			if (code.equals(emp.getCode())) {
				System.out.println("DELETE:");
				System.out.print(emp);
				list.remove(emp);
				return;
			}
		}
		System.out.println("\n> Code does not exist! <");
	}

//	Y5
	public void updateByCode() {
		System.out.print(">> Enter code: ");
		String codeS = sc.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (codeS.equals(list.get(i).getCode())) {
				System.out.print(">> Enter name: ");
				String code = sc.nextLine();
				System.out.print(">> Enter code: ");
				String name = sc.nextLine();
				System.out.print(">> Nhap salary: ");
				Integer salary = sc.nextInt();
				sc.nextLine();
				System.out.print(">> Enter title: ");
				String title = sc.nextLine();
				if (title.equals("Administrative")) {
					Employee nv = new Administrative(code, name, title, salary);
					list.set(i, nv);

				} else if (title.equalsIgnoreCase("Marketing")) {
					System.out.print(">> Enter sales: ");
					Integer sales = sc.nextInt();
					sc.nextLine();
					System.out.print(">> Enter commissions: ");
					Integer commissions = sc.nextInt();
					sc.nextLine();
					Employee nv = new Marketing(name, code, title, salary, sales, commissions);
					list.set(i, nv);

				} else if (title.equalsIgnoreCase("Manager")) {
					System.out.print(">> Enter salary liability: ");
					Integer liability = sc.nextInt();
					sc.nextLine();
					Employee nv = new Manager(code, name, title, salary, liability);
					list.set(i, nv);
				} else {
					System.out.print("\n> Title does not exist! <\n>> Retype!(Y(yes)/N(no)?: ");
					if (sc.nextLine().equalsIgnoreCase("Y")) {
						addEmployee();
					} else {
						menu();
					}
				}
			}
		}
	}

	public void searchBySalary() {
		System.out.print(">> Enter salary min: ");
		Integer min = sc.nextInt();
		sc.nextLine();
		System.out.print(">> Enter salary max: ");
		Integer max = sc.nextInt();
		sc.nextLine();
		for (Employee emp : list) {
			if ((emp.getSalary() >= min) && (emp.getSalary() <= max)) {
				System.out.println(emp);
			}
		}
	}

	public void sortByName() {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	public void sortBySalary() {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});
	}

	public void showHighIncome() {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.getIncome().compareTo(o1.getIncome());
			}
		});
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			if (i == 4) {
				return;
			}
		}

	}
}
