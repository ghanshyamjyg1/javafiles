import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//@FunctionalInterface  
//interface Hello {
//	int sayHello(int a,int b);
//}  
// 
//public class HelloWorld {
//	public static void main(String args[]){
//		Hello i = (x,y) ->x+y; 
//		 System.out.println(i.sayHello(5,10));
//	}
//}

class HelloWorld { 
	public static void main(String[] args) { 
//		Predicate<Integer> p = I ->(I >10);
//		System.out.println (p.test(100));
//		System.out.println (p.test(7));
		
//		Function<String, Integer> f = s ->s.length(); 
//		 System.out.println(f.apply("Durga")); 
//		 System.out.println(f.apply("Soft"));
		
//		Consumer<Integer> C=i->System.out.println(i*i);
//		C.accept(2);
		
		Supplier<String> S=()-> "Hello";
		System.out.println(S.get());
	}
} 
