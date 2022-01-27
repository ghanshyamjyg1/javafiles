class Pat3{
	void Left() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	/*void Right() {
		for(int i=0;i<5;i++) {
			for(int j=5-2-i;j>1;j--) {
				System.out.print("*");
			}
			
		}
	}*/
}

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pat3 P3=new Pat3();
		P3.Left();
//		P3.Right();
		

	}

}
