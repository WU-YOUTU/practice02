package practice02;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Lionel", "Messi", 25, 1.69, 70, "足球运动员");
		person1.printData();
		Person person2 = new Person("Michael", "Jeffrey", "Jordan", 25, 1.98, 98, "篮球运动员");
		person2.printData();
		
		Person.printCount();
	}
}
