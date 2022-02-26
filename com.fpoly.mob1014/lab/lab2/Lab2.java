package lab2;

import java.util.Scanner;

public class Lab2 {
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lab2 l2 = new Lab2();
		l2.menu();

	}

	private void menu() {
		System.out.println("\n\t\t\tMenu\n+---------------------------------------------------+");
		System.out.println("\n\t\t1.Giai pt bac I\n\t\t2.Giai pt bac II\n\t\t3.Tinh tien dien\n\t\t0.Thoat\n");
		System.out.println("+---------------------------------------------------+");
		System.out.print("==> Moi chon: ");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			b1();
			break;

		case 2:
			b2();
			break;

		case 3:
			b3();
			break;

		case 0:
			break;

		default:
			System.out.println("Lua chon khong hop le! Chon lai!");
			break;
		}
	}

	private void b1() {
		System.out.print("Nhap a = ");
		int a = sc.nextInt();
		System.out.print("Nhap b = ");
		int b = sc.nextInt();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			int x;
			x = -b / a;
			System.out.println("Phuong trinh co nghiem = " + x);
		}
	}

	private void b2() {
		System.out.print("Nhap a = ");
		int a = sc.nextInt();
		System.out.println("Nhap b = ");
		int b = sc.nextInt();
		System.out.println("Nhap c = ");
		int c = sc.nextInt();
		double x = 0, x_1 = 0, x_2 = 0;
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			double delta;
			delta = Math.pow(b, 2) - (4 * a * c);
			System.out.println("Delta = " + delta);
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				x = -b / (2 * a * c);
				System.out.println("Phuong trinh co nghiem kep x = " + x);
			} else {
				x_1 = (-b + Math.sqrt(delta)) / (2 * a);
				x_2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh co 2 nghiem phan biet la \nx1 = " + x_1 + "\nx2 = " + x_2);
			}
		}
	}

	private void b3() {
		System.out.print("Nhap so dien su dung: ");
		double so_dien = sc.nextDouble();
		System.out.println("So dien su dung la: " + so_dien);
		double tien_dien;
		if (so_dien < 50) {
			tien_dien = so_dien * 1000;
		} else {
			tien_dien = 50 * 1000 + (so_dien - 50) * 1200;
		}
		System.out.println("So tien phai dong la: " + tien_dien);
	}

}
