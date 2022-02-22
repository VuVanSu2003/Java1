package lab7;

public class Vuong extends ChuNhat {
	protected Double canh;

	public Vuong(Double canh) {
		super(canh, canh);
		this.canh = canh;
	}

	@Override
	public Double getChuVi() {
		chuVi = canh * 4;
		return chuVi;
	}

	@Override
	public Double getDienTich() {
		dienTich = Math.pow(canh, 2);
		return dienTich;
	}

	@Override
	public String toString() {
		return "Vuong [canh=" + dai + ", chuVi=" + getChuVi() + ", dienTich=" + getDienTich() + "]";
	}

}
