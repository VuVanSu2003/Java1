package assignment;

abstract public class Employee {
	protected String code, name, title;
	protected Double incomeTax = 0.0;
	protected Integer salary, income = 0;

	public Employee(String code, String name, String title, Integer salary) {
		this.code = code;
		this.name = name;
		this.title = title;
		this.salary = salary;
	}

	@Override
	public abstract String toString();

	public abstract Integer getIncome();

	public String getMaNV() {
		return code;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Double getIncomeTax() {
		if (income < 9000000) {
			incomeTax = income * 0.0;

		} else if (income < 15000000) {
			incomeTax = income * 0.1;
		} else {
			incomeTax = income * 0.12;
		}
		return incomeTax;
	}

	public void setIncomeTax(Double incomeTax) {
		this.incomeTax = incomeTax;
	}

}
