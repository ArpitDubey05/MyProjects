package interfaces;

public class InterfaceEx  {

	
	public interface move{
		static void kahani() {
			System.out.println("inside kahani ");
		}
		default void kahani2() {
			System.out.println("inside kahani2");
		}
		int a=1;
		void kahani3();
	}
	
	public interface sit{
		
		static String kahani() {
			System.out.println("inside kahani 1");
			String a="sad";
			return a;
			
		}
		default void kahani5() {
			System.out.println("inside kahani2");
		}
		int a=1;
		void kahani4();
	}
		
	public class InterfaceExe implements move,sit{	
	
	

	@Override
	public void kahani4() {
		System.out.println("overridden abstract method kahani 4");
		
	}

	@Override
	public void kahani3() {
		System.out.println("overridden abstract method kahani 3");
		
	}

}
	
}