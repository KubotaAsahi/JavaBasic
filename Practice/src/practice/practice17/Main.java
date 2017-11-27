package practice.practice17;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		
		Employee employee2 = new Employee("太郎");
		
		Employee employee3 = new Employee("二郎",30);
		
		
			System.out.println(employee1.getProfile());
	        System.out.println(employee2.getProfile());
	        System.out.println(employee3.getProfile());
	}
}
