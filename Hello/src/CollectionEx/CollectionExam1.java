package CollectionEx;
import java.util.*;

public class CollectionExam1 {

	public static void main(String[] args) {
		//Non Generic Collection
		ArrayList A=new ArrayList();
		A.add(10);
		A.add(15.5);
		A.add(true);
		A.add(10.5f);
		A.add("Hlw");
		
		for(Object ob:A) {
			System.out.println(ob);
		}
//-------------------------------------------------------
		
		Iterator I=A.iterator();
		while(I.hasNext()) {
			System.out.println(I.next());
		}
	

	}

}
