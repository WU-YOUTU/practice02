package practice02;

public class Person {
	private static int count = 0;
	private String firstName, middleName, lastName;
	private int age;
	private double height, weight;
	private String job;
	
	Person(String firstName, String lastName, int age, double height, double weight, String job) {
		Person.count++;
		
		System.out.println("----------------------------");
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
	}
	
	Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
		this(firstName, lastName, age, height, weight, job);
		this.middleName = middleName;
	}
	
	public String fullName() {
		if (middleName == null) {
			return this.firstName + " " + this.lastName;
		} else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
	}
	
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	public void printData() {
		System.out.println("姓名：" + this.fullName());
		System.out.println("年龄：" + this.age);
		System.out.println("BMI指数：" + Math.round(this.bmi()));
		System.out.println("工作：" + this.job);
	}
	
	public static void printCount() {
		System.out.println("============================");
		System.out.println("合计：" + Person.count + "人");
	}
}
