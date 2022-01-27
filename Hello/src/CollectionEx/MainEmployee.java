package CollectionEx;

import java.util.ArrayList;
import java.util.List;

class DemoEmployee{
	
	List<Employee> L;
	
	public DemoEmployee() {
		
		L=new ArrayList<Employee>();
	}
	public void Accept() {
		
		L.add(new Employee(1, "A", 5000));
		L.add(new Employee(2, "B", 6000));
		L.add(new Employee(3, "C", 7000));
		L.add(new Employee(4, "D", 8000));
		L.add(new Employee(5, "E", 9000));
		System.out.println(L);//For address
		
	}
	public void Print() {
		for(Employee e:L)
		{
			System.out.println(e.empno);
			System.out.println(e.ename);
			System.out.println(e.basic);
		}
	}
	
}

public class MainEmployee {
	public static void main(String[] args) {
		DemoEmployee d=new DemoEmployee();
		d.Accept();
		d.Print();
		
	}

}
