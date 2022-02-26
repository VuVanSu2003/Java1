package assignment;

public class Manager extends Employee {
	private Integer liability;

	public Manager(String code, String name, String title, Integer salary, Integer liability) {
		super(code, name, title, salary);
		this.liability = liability;
	}

	@Override
	public Integer getIncome() {
		income = salary + liability;
		return income;
	}

	@Override
	public String toString() {
		return "Manager	[code=" + code + ", name=" + name + ", title=" + title + ", salary=" + salary
				+ ", liability=" + liability + ", income=" + getIncome() + ", incomeTax=" + getIncomeTax() + "]";
	}

	public Integer getLiability() {
		return liability;
	}

	public void setLiability(Integer liability) {
		this.liability = liability;
	}
}
