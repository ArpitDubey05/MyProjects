package defaultPackage;

public class Demo {
	
	 public static void main(String[] args) {
	      Integer i = new Integer(20); //initialize a object of Integer class with value as 20.
	      System.out.println(i);
	      System.out.println(operate(i));// method to change value of object.
	      System.out.println(i); //value doesn't change shows that object is immutable.
	   }
	   private static int operate(Integer i) {
	      i = i + 1;
	      return i;
	   }

}
