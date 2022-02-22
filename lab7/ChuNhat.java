package lab7;

public class ChuNhat {
	protected Double dai, rong, chuVi, dienTich;

	public ChuNhat(Double dai, Double rong) {
		this.dai = dai;
		this.rong = rong;
	}

	public ChuNhat() {
	}

	@Override
	public String toString() {
		return "Hinh [dai=" + dai + ", rong=" + rong + ", chuVi=" + getChuVi() + ", dienTich=" + getDienTich() + "]";
	}

	public Double getDai() {
		return dai;
	}

	public void setDai(Double dai) {
		this.dai = dai;
	}

	public Double getRong() {
		return rong;
	}

	public void setRong(Double rong) {
		this.rong = rong;
	}

	public Double getChuVi() {
		chuVi = (dai + rong) * 2;
		return chuVi;
	}

	public void setChuVi(Double chuVi) {
		this.chuVi = chuVi;
	}

	public Double getDienTich() {
		dienTich = dai * rong;
		return dienTich;
	}

	public void setDienTich(Double dienTich) {
		this.dienTich = dienTich;
	}

}
