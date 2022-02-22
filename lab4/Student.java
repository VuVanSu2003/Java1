package lab4;

import java.util.Scanner;

public class Student {
	private Scanner sc = new Scanner(System.in);
	private String code, name;
	private Integer age, phoneNumber;

	public Student(String code, String name, Integer age, Integer phoneNumber) {
		this.code = code;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public Student() {

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

	public void input() {
		System.out.print(">> Name: ");
		this.name = sc.nextLine();
		System.out.print(">> Code: ");
		this.code = sc.nextLine();
		System.out.print(">> Age: ");
		this.age = sc.nextInt();
		System.out.print(">> Phone Number: ");
		this.phoneNumber = sc.nextInt();
	}

	public void output() {
		System.out.println(toString());
	}

}
