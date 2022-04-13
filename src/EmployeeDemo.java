import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Hour Worked: ");
		double hour = Double.parseDouble(sc.nextLine());
		Employee empDemo = new Employee(name, hour);
		System.out.println("Total pay is: $" + empDemo.getTotalPay());
	}
}
