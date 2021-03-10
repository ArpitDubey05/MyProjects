package accessModifier;

public class StaticTest {
	
	static String staticvar="static value";
	String nonststic="nonstatic value";

	public static String StaticMethod() {
		
		String name="Arpit dubey";
		return name;
		
		
	}

	public String Nonstatic() {
		
		String a=("i am inside a nonstatic method");
		return a;
	}
}
