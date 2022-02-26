package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_L6 {

	private ArrayList<SanPham> dssp = new ArrayList<>();
	private ArrayList<SinhVien> dssv = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main_L6 l6 = new Main_L6();
		l6.b1();
		l6.b2();
		l6.b3();
	}

	private void b1() {
		System.out.print(">> Nhap ten: ");
		String fullName = sc.nextLine();
		fullName = fullName.trim();
		String[] tmp = fullName.split("\\s+");

		if (tmp.length < 3) {
			System.out.println("Ten phai co day du ho, ten dem, ten");
			return;
		}

		for (int i = 0; i < tmp.length; i++) {
			if (i == 0 || i == tmp.length - 1) {
				System.out.print(tmp[i].toUpperCase());
			} else {
				System.out.print("\\s" + tmp[i].toLowerCase() + "\\s");
			}
		}
	}

	public void b2() {
		for (int i = 0; i < 5; i++) {
			System.out.print(">> Nhap ten: ");
			String ten = sc.nextLine();
			System.out.print(">> Nhap gia: ");
			Integer gia = sc.nextInt();
			sc.nextLine();
			System.out.print(">> Nhap hang: ");
			String hang = sc.nextLine();
			SanPham sp = new SanPham(ten, hang.trim(), gia);
			dssp.add(sp);
		}
		for (SanPham sp : dssp) {
			if (sp.getHang().equals("Nokia")) {
				System.out.println(sp);
			}
		}
	}

	public void b3() {

		while (true) {
			System.out.print(">> Nhap ten: ");
			String hoTen = sc.nextLine();
			System.out.print(">> Nhap email: ");
			String email = sc.nextLine();
			System.out.print(">> Nhap SDT: ");
			String sdt = sc.nextLine();
			System.out.print(">> Nhap CMND: ");
			String cmnd = sc.nextLine();
			System.out.println("\n");

			if ((hoTen.matches("\\w") || hoTen.matches("\\w+\\d")) && email.matches("\\w+@fpt.edu.com")
					&& sdt.matches("0\\d{9}") && cmnd.matches("\\d{12}")) {
				SinhVien sv = new SinhVien(hoTen, email, sdt, cmnd);
				dssv.add(sv);
				if (dssv.size() == 5) {
					return;
				}
			} else {
				if (hoTen.matches("\\w") || hoTen.matches("\\w+\\s+\\w")) {
				} else {
					System.err.println("Ban da nhap sai ten.");
				}
				if (email.matches("\\w+@fpt.edu.com")) {
				} else {
					System.err.println("Ban da nhap sai email");
				}
				if (sdt.matches("0\\d{9}")) {
				} else {
					System.err.println("Ban da nhap sai sdt");
				}
				if (cmnd.matches("\\d{12}")) {
				} else {
					System.err.println("Ban da nhap sai");
				}
			}

			for (SinhVien sv : dssv) {
				System.out.println(sv);
			}
		}
	}
}