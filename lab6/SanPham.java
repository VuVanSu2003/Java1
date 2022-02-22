package lab6;

public class SanPham {
	private String ten, hang;
	private Integer gia;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	@Override
	public String toString() {
		return "SanPham [ten=" + ten + ", hang=" + hang + ", gia=" + gia + "]";
	}

	public SanPham(String ten, String hang, Integer gia) {
		this.ten = ten;
		this.hang = hang;
		this.gia = gia;
	}

	public Integer getGia() {
		return gia;
	}

	public void setGia(Integer gia) {
		this.gia = gia;
	}

}
