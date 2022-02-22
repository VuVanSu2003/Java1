package lab7;

abstract public class SVPoly {
	protected String hoTen, nganh, hocLuc;
	protected Double diem;

	public SVPoly(String hoTen, String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	abstract public Double getDiem();

	public void setDiem(Double diem) {
		this.diem = diem;
	}

	public String getHocLuc() {
		if (diem < 5) {
			hocLuc = "Yeu";
		} else if (diem < 6.5) {
			hocLuc = "Trung Binh";
		} else if (diem < 7.5) {
			hocLuc = "Kha";
		} else if (diem < 9) {
			hocLuc = "Gioi";
		} else {
			hocLuc = "Xuat Sac";
		}
		return hocLuc;
	}

	public void setHocLuc(String hocLuc) {
		this.hocLuc = hocLuc;
	}
}
