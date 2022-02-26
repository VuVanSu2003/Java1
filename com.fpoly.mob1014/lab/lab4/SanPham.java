package lab4;

import java.util.Scanner;

public class SanPham {
	Scanner sanpham = new Scanner(System.in);
	private String tenSp;
	private Double donGia, giamGia;

	public String getTenSp() {
		return this.tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public Double getDonGia() {
		return this.donGia;
	}

	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

	public Double getGiamGia() {
		return this.giamGia;
	}

	public void setGiamGia(Double giamGia) {
		this.giamGia = giamGia;
	}

	public SanPham(String tenSp, Double donGia) {

		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = 0.0;
	}

	public SanPham(String tenSp, Double donGia, Double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	private double getThueNhapKhau() {
		return this.donGia * 0.1;
	}

	public void input() {

		System.out.print(">> Ten: ");
		this.tenSp = sanpham.nextLine();
		System.out.print(">> Don gia: ");
		this.donGia = sanpham.nextDouble();
		System.out.print(">> Giam gia: ");
		this.giamGia = sanpham.nextDouble();
	}

	public void output() {
		Double tienTra = this.donGia - this.giamGia - (this.donGia * 0.1);
		System.out.println("\n\t<<<<<>>>>>\n");
		System.out.println("<< Ten: " + getTenSp());
		System.out.printf("<< Don gia: %.2f\n", getDonGia());
		System.out.printf("<< Giam gia: %.2f\n", getGiamGia());
		System.out.printf("<< Thue san pham: %.2f\n", getThueNhapKhau());
		System.out.printf("<< Tong tien tra: %.2f\n", tienTra);
		System.out.println("\n\t<<<<<>>>>>\n");
	}

	public static void main(String[] args) {
		String TenSp = "San Pham 1";
		Double donGia = 12000.0, giamGia = 2000.0;
		SanPham sp1 = new SanPham(TenSp, donGia, giamGia);
//		SanPham sp1 = new SanPham("San Pham 1", 12000.0, 2000.0)
//		sp1.input();
		sp1.output();
		TenSp = "San Pham 2";
		donGia = 20000.0;
		SanPham sp2 = new SanPham(TenSp, donGia);
//		SanPham sp2 = new SanPham("San Pham 2", 50000.0);
//		sp2.input();
		sp2.output();

	}

}
