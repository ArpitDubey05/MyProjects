package interfaces;

import interfaces.InterfaceEx.move;
import interfaces.InterfaceEx.sit;

public class InterfaceMain implements move,sit {

	public static void main(String[] args) {
		move.kahani();
		sit.kahani();
		System.out.println("value of A from move is "+move.a);
		InterfaceMain i=new InterfaceMain();
		i.kahani2();
		i.kahani5();
	}

	@Override
	public void kahani4() {
		System.out.println("overridden abstract method kahani 4");
		
	}

	@Override
	public void kahani3() {
		System.out.println("overridden abstract method kahani 3");
		
	}
}
