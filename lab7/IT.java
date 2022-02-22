package lab7;

public class IT extends SVPoly {
	private Double java, css, html;

	public IT(String hoTen, String nganh, Double java, Double css, Double html) {
		super(hoTen, nganh);
		this.java = java;
		this.css = css;
		this.html = html;
	}

	public Double getJava() {
		return java;
	}

	public void setJava(Double java) {
		this.java = java;
	}

	public Double getCss() {
		return css;
	}

	public void setCss(Double css) {
		this.css = css;
	}

	public Double getHtml() {
		return html;
	}

	public void setHtml(Double html) {
		this.html = html;
	}

	@Override
	public String toString() {
		return "IT [java=" + java + ", css=" + css + ", html=" + html + ", getDiem()=" + getDiem() + ", getHoTen()="
				+ getHoTen() + ", getNganh()=" + getNganh() + ", getHocLuc()=" + getHocLuc() + "]";
	}

	@Override
	public Double getDiem() {
		diem = (2 * java + css + html) / 4;
		return diem;
	}

}
