package lab6;

public class SinhVien {
	private String ten, email, sdt, cmnd;

	public SinhVien(String ten, String email, String sdt, String cmnd) {
		this.ten = ten;
		this.email = email;
		this.sdt = sdt;
		this.cmnd = cmnd;
	}

	@Override
	public String toString() {
		return "SinhVien [ten=" + ten + ", email=" + email + ", sdt=" + sdt + ", cmnd=" + cmnd + "]";
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

}
