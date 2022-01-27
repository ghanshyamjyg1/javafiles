package CollectionEx;

import java.util.*;

class EmployeeDemo{
	void Print(List<Employee> L) {
		for(Employee Ob:L) {
			System.out.println(Ob.empno);
			System.out.println(Ob.ename);
			System.out.println(Ob.basic);
		}
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		List<Employee> L=new ArrayList<>();
		Employee E=null;
		E=new Employee(1, "Kunal", 25000);
		L.add(E);
		E=new Employee(2, "Mahesh", 30000);
		L.add(E);
		E=new Employee(3, "Ramesh", 35000);
		L.add(E);
		EmployeeDemo Ed=new EmployeeDemo();
		Ed.Print(L);
	}

}
