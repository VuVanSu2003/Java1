package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5 {
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//			Lab5 bai1 = new Lab5();
//			bai1.b1();
		Lab5 bai2 = new Lab5();
		bai2.menu_b2();

	}

	// Bai 1
	private ArrayList<Double> sothuc = new ArrayList<>();

	public void b1() {
		while (true) {
			System.out.print("Nhap so: ");
			Double so = sc.nextDouble();
			sothuc.add(so);
			sc.nextLine();
			System.out.print("Them ?(Y/N): ");
			if (sc.next().equalsIgnoreCase("Y")) {
				continue;
			} else {
				break;
			}
		}
		for (Double a : sothuc) {

			System.out.println("So: " + a);

		}
	}

	// Bai 2
	private ArrayList<String> hoTen = new ArrayList<String>();

	public void menu_b2() {
		String in;
		do {
			System.out.println("\n\t<<<<<MENE>>>>>\n");
			System.out.println("1. Nhap danh sach ho va ten");
			System.out.println("2. Xuat danh sach ho ten");
			System.out.println("3. Xuat danh sach ngau nhien");
			System.out.println("4. Sap xep giam dan va xuat danh sach");
			System.out.println("5. Tim va xoa ho ten nhap tu ban phim");
			System.out.println("6. Ket thuc");
			System.out.println(">> Lua chon: ");
			in = sc.nextLine();
			switch (Integer.parseInt(in)) {
			case 1:
				System.out.println("Chuc nang nhap danh sach");
				Y1();
				break;
			case 2:
				System.out.println("Chuc nang xuat danh sach");
				Y2();
				break;
			case 3:
				System.out.println("Chuc nang xuat danh sach ngau nhien");
				Y3();
				break;
			case 4:
				System.out.println("Chuc nang sap xep giam dan");
				Y4();
				break;
			case 5:
				System.out.println("Chuc nang tim va xoa ho ten nha tu ban phim");
				Y5();
			case 0:
				break;
			default:
				System.out.println("Lua chon khong ton tai! Nhap Lai!");
				break;
			}
		} while (Integer.parseInt(in) != 0);

	}

	private void Y1() {
		while (true) {
			System.out.println("Nhap ho ten: ");
			String name = sc.nextLine();
			hoTen.add(name);
			System.out.println("Nhap them ?(Y(y)/N(n)): ");
			if (sc.nextLine().equalsIgnoreCase("Y")) {
				continue;
			} else {
				break;
			}

		}
	}

	private void Y2() {
		for (String name : hoTen) {
			System.out.println("Ho ten: " + name);
		}
	}

	private void Y3() {
		Collections.shuffle(hoTen);// random danh sach
		for (String nameRd : hoTen) {
			System.out.println("Ho ten: " + nameRd);
		}
	}

	private void Y4() {
//		Collections.sort(hoTen, new Comparator<String>() {
		//
//			@Override
//			public int compare(String o1, String o2) {
//				return 
//		 o2.compareTo(o1); //sap xep giam
//		 o1.compareTo(o2); //sap xep tang
//			}
//		});
		Collections.sort(hoTen); // sap xep tang
		Collections.reverse(hoTen); // dao nguoc danh sach
		for (String namesort : hoTen) {
			System.out.println("Ho ten: " + namesort);
		}
	}

	private void Y5() {
		int j = 0;
		System.out.print(">> Nhap ten can tim: ");
		String nameS = sc.nextLine();
		for (String nameL : hoTen) {
			if (nameL.equals(nameS)) {
				System.out.println("Da xoa: " + nameS);
				hoTen.remove(nameS);
				j++;
			}
		}
		if (j == 0) {
			System.out.println("Danh sach khong ton tai: " + nameS);
		}
	}
}
