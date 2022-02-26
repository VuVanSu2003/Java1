package lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<ChuNhat> dsh = new ArrayList<>();
	private ArrayList<SVPoly> dssv = new ArrayList<>();

	public static void main(String[] args) {
		Main l7 = new Main();
//		l7.nhap();
		l7.menu();

	}

//	B1
	public void nhap() {
		System.out.println("Chon hinh:\t1.Chu Nhat\t2.Vuong");
		System.out.print(">> Nhap: ");
		String key = sc.nextLine();
		switch (Integer.parseInt(key)) {
		case 1:
			System.out.print(">> Nhap dai: ");
			Double dai = sc.nextDouble();
			sc.nextLine();
			System.out.print(">> Nhap rong: ");
			Double rong = sc.nextDouble();
			sc.nextLine();
			ChuNhat cn = new ChuNhat(dai, rong);
			dsh.add(cn);
			break;
		case 2:
			System.out.print(">> Nhap canh: ");
			Double canh = sc.nextDouble();
			sc.nextLine();
			ChuNhat vuong = new Vuong(canh);
			dsh.add(vuong);
			break;
		default:
			System.out.println("Nhap sai! Nhap lai!");
			break;
		}

		System.out.print("Nhap them? Y/N: ");
		if (sc.nextLine().equalsIgnoreCase("Y")) {
			nhap();
		} else {
			xuat();
		}
	}

	public void xuat() {
		for (int i = 0; i < dsh.size(); i++) {
			System.out.println(dsh.get(i).toString());
		}
	}

//	B2
	public void menu() {
		String key = "";
		do {
			System.out.println("\n\t>MENU<\n");
			System.out.println("1. Nhap danh sach.");
			System.out.println("2. Xuat danh sach.");
			System.out.println("3. Xuat danh sach sv co hoc luc gioi.");
			System.out.println("4. Sap xep sv theo diem.");
			System.out.println("0. Thoat");
			System.out.print(">> Moi chon: ");
			key = sc.nextLine();
			switch (Integer.parseInt(key)) {
			case 1:
				nhapsv();
				break;
			case 2:
				xuatds();
				break;
			case 3:
				xuatHLG();
				break;
			case 4:
				sxDiem();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhap sai! Nhap lai!");
				break;
			}
		} while (Integer.parseInt(key) != 0);
	}

	public void nhapsv() {
		System.out.print(">> Nhap ten: ");
		String ten = sc.nextLine();
		System.out.print(">> Nhap nganh: ");
		String nganh = sc.nextLine();
		if (nganh.equals("IT")) {
			System.out.print(">> Nhap diem java: ");
			Double java = sc.nextDouble();
			sc.nextLine();
			System.out.print(">> Nhap diem css: ");
			Double css = sc.nextDouble();
			sc.nextLine();
			System.out.print(">> Nhap diem html: ");
			Double html = sc.nextDouble();
			sc.nextLine();
			SVPoly it = new IT(ten, nganh, java, css, html);
			dssv.add(it);
		} else if (nganh.equals("Biz")) {
			System.out.print(">> Nhap diem marketing: ");
			Double marketing = sc.nextDouble();
			sc.nextLine();
			System.out.print(">> NHap diem sales: ");
			Double sales = sc.nextDouble();
			sc.nextLine();
			SVPoly biz = new Biz(ten, nganh, marketing, sales);
			dssv.add(biz);
		} else {
			System.out.println("Nhap sai! Nhap lai!");
		}
	}

	public void xuatds() {
		for (SVPoly sv : dssv) {
			System.out.println(sv);
		}
	}

//	xuat ds theo hl gioi
	public void xuatHLG() {
		for (SVPoly sv : dssv) {
			if (sv.getHocLuc().equals("Gioi")) {
				System.out.println(sv);
			}
		}
	}

//	sap Xep theo diem
	public void sxDiem() {
		Collections.sort(dssv, new Comparator<SVPoly>() {

			@Override
			public int compare(SVPoly o1, SVPoly o2) {
				// TODO Auto-generated method stub
				return o1.getDiem().compareTo(o2.getDiem());
			}
		});
		for (SVPoly sv : dssv) {
			System.out.println(sv);
		}

	}
}
