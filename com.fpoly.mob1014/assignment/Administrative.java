package assignment;

public class Administrative extends Employee {

	public Administrative(String code, String name, String title, Integer salary) {
		super(code, name, title, salary);
	}

	@Override
	public Integer getIncome() {
		income = salary;
		return income;
	}

	@Override
	public String toString() {
		return "Administrative [code=" + code + ", name=" + name + ", title=" + title + ", salary=" + salary
				+ ", income=" + getIncome() + ", incomeTax=" + getIncomeTax() + "]";
	}

}
