package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		bai_1();
		bai_2();
		bai_3();
		bai_4();
	}

// bai 1
	public static void bai_1() {

		Scanner snt = new Scanner(System.in);
		System.out.print("Nhap so = ");
		int sokt = snt.nextInt();
		int i, j = 0;
		for (i = 2; i <= Math.sqrt(sokt); i++) {
			if (sokt % i == 0) {
				j = 1;
				break;
			}
		}
		if (j == 0) {
			System.out.println("So " + sokt + " la so nguyen to");
		} else {
			System.out.println("So " + sokt + " khong phai so nguyen to");
		}
	}

// bai 2
	public static void bai_2() {
		Scanner bcc = new Scanner(System.in);
		System.out.print("Nhap bang cuc chuong ca xem: ");
		int i = bcc.nextInt();

		for (int j = 1; j <= 10; j++) {
			System.out.printf("%d x %d = %d\n", i, j, i * j);
		}

	}

// bai 3
	public static void bai_3() {
		Scanner arrayx = new Scanner(System.in);
		int i, j = 0, h = 0;
		double k = 0;
		System.out.print("Nhap so luong sv: ");
		int x = arrayx.nextInt();
		int arr[] = new int[x];
		for (i = 0; i < arr.length; i++) {
			System.out.print("Nhap diem " + i + ": ");
			int diem = arrayx.nextInt();
			arr[i] = diem;

		}
		System.out.print("\nBefor sort: ");
		for (i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}
		System.out.print("\nAffter sort: ");
		for (i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.print("\t" + arr[i]);
			if (arr[i] % 3 == 0) {
				j++;
				h += arr[i];
			}
		}
		k = h / j;
		System.out.println("\nMin = " + arr[0]);
		System.out.println("Trung binh = " + k);
	}

// bai 4
	public static void bai_4() {

		Scanner sv = new Scanner(System.in);
		int i = 0;
		System.out.println("Nhap so lg sv: ");
		int x = sv.nextInt();
		String hoTen[] = new String[10];
		double diem[] = new double[10];
		String hocLuc[] = new String[10];
		for (i = 0; i < x; i++) {

			System.out.println("Nhap sv: " + i);
			System.out.print("Nhap ho ten: ");
			String ho_ten = sv.next();
			System.out.print("Nhap diem: ");
			double diem_so = sv.nextDouble();
			hoTen[i] = ho_ten;
			diem[i] = diem_so;
		}
		System.out.println("\n\t\t+===================+\n");
		for (i = 0; i < x; i++) {
			for (int j = x - 1; j > i; j--) {
				if (diem[j] < diem[j - 1]) {
					String ten_tam = hoTen[j];
					hoTen[j] = hoTen[j - 1];
					hoTen[j - 1] = ten_tam;
					double diem_tam = diem[j];
					diem[j] = diem[j - 1];
					diem[j - 1] = diem_tam;
					String hluc_tam = hocLuc[j];
					hocLuc[j] = hocLuc[j - 1];
					hocLuc[j - 1] = hluc_tam;
				}
			}
			System.out.println("\t\tTen :" + hoTen[i]);
			System.out.println("\t\tDiem: " + diem[i]);

			if (diem[i] < 5) {
				System.out.println("\t\tHoc Luc: Yeu");
			} else if (diem[i] < 6.5) {
				System.out.println("\t\ttHoc luc: Trung Binh");
			} else if (diem[i] < 7.5) {
				System.out.println("\t\tHoc luc: Kha");
			} else if (diem[i] < 9) {
				System.out.println("\t\ttHoc luc: Gioi");
			} else {
				System.out.println("\t\tHoc luc: Xuat Sac");
			}
		}

	}

}
