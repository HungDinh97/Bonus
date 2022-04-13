import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void totalPayTest() {
		String name = "test";
		double hours = 30;
		double hoursExtra = 48;
		Employee test = new Employee(name, hours);
		
		assertEquals(450, test.getTotalPay());
		
		test.setHours(hoursExtra);
		test.setTotalPay(hoursExtra);
		assertEquals(732.0,test.getTotalPay());
	}

}
