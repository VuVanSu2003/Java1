package assignment;

public class Marketing extends Employee {
	private Integer sales, commissions;

	public Marketing(String code, String name, String title, Integer salary, Integer sales, Integer commissions) {
		super(code, name, title, salary);
		this.sales = sales;
		this.commissions = commissions;
	}

	@Override
	public Integer getIncome() {
		income = salary + sales + commissions;
		return income;
	}

	@Override
	public String toString() {
		return "Marketing [code=" + code + ", name=" + name + ", title=" + title + ", salary=" + salary + "sales="
				+ sales + ", commissions=" + commissions + ", income=" + getIncome() + ", incomeTax=" + getIncomeTax()
				+ "]";
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Integer getCommissions() {
		return commissions;
	}

	public void setCommissions(Integer commissions) {
		this.commissions = commissions;
	}

}
