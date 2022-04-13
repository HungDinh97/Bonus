
public class Employee {

		private String name;
		private double hours;
		private double totalPay;
		
		public static final double  HOUR_RATE = 15.0;
		public static final double  HOUR_EXTRA_RATE = 16.5;
		public static final double  NORMAL_TIME_LIMIT = 40.0;
		
		public Employee(String name, double hours) {
			this.name = name;
			this.hours = hours;
			setTotalPay(hours);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getHours() {
			return hours;
		}

		public void setHours(double hours) {
			this.hours = hours;
		}

		public double getTotalPay() {
			return totalPay;
		}

		public void setTotalPay(double hours) {
			if(hours<=0) {
				this.totalPay = 0.0;
			}
			else if(hours<= NORMAL_TIME_LIMIT) {
			this.totalPay = hours*HOUR_RATE;
			} else if( hours> NORMAL_TIME_LIMIT) {
				this.totalPay = NORMAL_TIME_LIMIT*HOUR_RATE + (hours- NORMAL_TIME_LIMIT)*HOUR_EXTRA_RATE;
			}
		}
}
