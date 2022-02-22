package lab7;

public class Biz extends SVPoly {
	private Double marketing, sales;

	@Override
	public String toString() {
		return "Biz [marketing=" + marketing + ", sales=" + sales + ", getDiem()=" + getDiem() + ", getHoTen()="
				+ getHoTen() + ", getNganh()=" + getNganh() + ", getHocLuc()=" + getHocLuc() + "]";
	}

	public Double getMarketing() {
		return marketing;
	}

	public void setMarketing(Double marketing) {
		this.marketing = marketing;
	}

	public Double getSales() {
		return sales;
	}

	public void setSales(Double sales) {
		this.sales = sales;
	}

	public Biz(String hoTen, String nganh, Double marketing, Double sales) {
		super(hoTen, nganh);
		this.marketing = marketing;
		this.sales = sales;
	}

	@Override
	public Double getDiem() {
		diem = (2 * marketing + sales) / 3;
		return diem;
	}
}
