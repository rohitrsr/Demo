import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice2 {
	public static void main(String... args) {

		/*
		 * Collect Emp Whose Age is greater than 30 sortBy salary asc and Unique with
		 * Emp Name output [3 Javed 32 70000 , 5 Nikhil 35 90000 ]
		 */

//	List<Employee> emp = Data.empListDev.stream().filter(e -> e.getAge() > 30)
//			.sorted(Comparator.comparingInt(Employee::getEmpSal)).collect(Collectors.toList());
//
//	Map<String, Employee> m = new LinkedHashMap<>();
//	for (Employee r : emp) {
//		m.put(r.getEmpName(), r);
//	}
//	
//	System.out.println("apple".charAt(3));
//	}

		Map<String, Employee> emp = Data.empListDev.stream().filter(e -> (e.getAge() > 30))
				.sorted(Comparator.comparing(Employee::getEmpSal))
				.collect(Collectors.toMap(Employee::getEmpName, Function.identity(), (x1, x2) -> x2));
		System.out.println(emp);
	}
}

class Name implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmpSal() > o2.getEmpSal())
			return 1;
		else if (o1.getEmpSal() < o2.getEmpSal())
			return -1;
		else
			return 0;
	}

}

class Data {

	public static List<Employee> empListDev = Arrays.asList(
			new Employee(1, "Rushikesh", "rk1997@gmail", new Address("Appa", 400, null), 24, 50000),
			new Employee(2, "Ritesh", "rp1997@gmail", new Address("Appa", 400, null), 26, 60000),

			new Employee(3, "Javed", "js1997@gmail", new Address("Appa", 400, "Mumbai"), 32, 70000),
			new Employee(4, "Javed", "js1998@gmail", new Address("Cst", 400, null), 36, 80000),

			new Employee(5, "Nikhil", "ns1997@gmail", new Address("Appa", 400, null), 35, 90000),
			new Employee(6, "Rahul", "rh1997@gmail", new Address("Hinjadi", 500, "Pune"), 27, 90000));
}

class Employee {

	private int empId;

	private String empName;

	private String email;

	private Address address;

	private int age;
	private int empSal;

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public Employee(int empId, String empName, String email, Address address, int age, int empSal) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.address = address;
		this.age = age;
		this.empSal = empSal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + age + " " + empSal + " " + email + " ";
	}

	public Employee() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

class Address {
	private String street;
	private int pinCode;
	private String city;

	public Address(String street, int pinCode, String city) {
		this.street = street;
		this.pinCode = pinCode;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	@Override
	public String toString() {
		return "Address{" + "street='" + street + '\'' + ", pinCode=" + pinCode + ", city='" + city + '\'' + '}';
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
